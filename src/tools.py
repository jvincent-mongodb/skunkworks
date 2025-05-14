import os
import uuid
import subprocess
import traceback

from langchain_core.tools import tool
from langchain_openai import AzureChatOpenAI

class ExampleCodeDependencyResolverTools:
    def __init__(self):
        self.llm = AzureChatOpenAI(
            azure_deployment="gpt-4o-mini", 
            api_version='2024-10-21',
            timeout=60,
            temperature=0,
            max_tokens=None)

    def get_tools(self):
        return [
            # self.get_code_example,
            self.call_llm,
            self.write_executable_and_dockerfile,
            self.build_image,
            self.run_container,
            self.get_container_logs
        ]
    
    # @tool(parse_docstring=True)
    # def get_code_examples(query):
    #     pass
    #     # TODO: pass query as collection name
    #     # get all code examples for a given collection
    #     # push working Docker images to Hub and tag each
    #     # update image builder to use the lastest tagged 
    #     # version as a base image and update as necessary
    #     # to ultimately provide a testing container image 
    #     # for each collection (or something close to that)
    
    @tool(parse_docstring=True)
    def call_llm(self, query: str) -> str:
        """Call the LLM to generate a Dockerfile that can run the code example 
        in this message.

        Args:
            query (string): A string provided by the user that contains a code 
            example to build a Docker image in which it can be run.

        Returns:
            dockerfile_content (string): The contents of the Dockerfile which 
            will be used to build an image in which the provided code example 
            can be run.

            executable_filename (string): A filename for the code example.
        
        """
        dockerfile_content = self.llm.invoke(
            f"Write a Dockerfile to run the following code example:\n\n{query}").content
        executable_filename = self.llm.invoke(
            f"Write a filename for the following example code to be written to:\n\n{query}").content
        
        return dockerfile_content, executable_filename

    @tool(parse_docstring=True)
    def write_executable_and_dockerfile(code_example: str, executable_filename: str, dockerfile_content: str) -> str:
        """Write an executable file containing the example code and a Dockerfile 
        with the llm generated Dockerfile content.

        Args: 
            code_example (string): A code example to determine the dependencies for.

            executable_filename (string): A filename for the code example.

            dockerfile_content (string): The contents of the Dockerfile which 
            will be used to build an image in which the provided code example 
            can be run.
        
        Returns: 
            dir_path (string): The file path to a Dockerfile's parent directory.
        """
        unique_id = uuid.uuid4().hex[:8]
        dir_path = f'/Users/jeffrey.vincent/skunkworks/dockerfiles/{unique_id}'
        os.makedirs(dir_path, exist_ok=True)

        executable_path = os.path.join(dir_path, executable_filename)
        with open(executable_path, 'w') as f:
            f.write(code_example)

        dockerfile_path = os.path.join(dir_path, 'Dockerfile')
        with open(dockerfile_path, 'w') as f:
            f.write(dockerfile_content)

        os.chmod(dockerfile_path, 0o0777)

        return dir_path

    @tool(parse_docstring=True)
    def build_image(dir_path: str) -> str:
        """Build a local Docker image from a Dockerfile path and return image name.

        Args: 
            dir_path (string): The path to a Dockerfile's parent directory.
        
        Returns: 
            image_name (string): The name of a Docker image.
        """
        os.chdir(dir_path)
        image_name = f'{uuid.uuid4().hex[:8]}'

        try:
            result = subprocess.run(
                ['docker', 'build', '-t', image_name, '.'],
                check=True,
                capture_output=True,
                text=True
            )
            print("[Docker Build Output]", result.stdout)
            return image_name
        except subprocess.CalledProcessError as e:
            print("[Docker Build Error]", e.stderr)
            traceback.print_exc()
            raise RuntimeError(f"Docker build failed:\n{e.stderr}")

    @tool(parse_docstring=True)
    def run_container(image_name: str) -> str:
        """Run a container from a Docker image and return container ID.

        Args:
            image_name (string): The name of the Docker image to run.

        Returns:
            container_id (string): The ID of the started container.
        """
        result = subprocess.run(
            ['docker', 'run', '-d', image_name],
            capture_output=True,
            text=True,
            check=True
        )
        container_id = result.stdout.strip()
        return container_id

    @tool(parse_docstring=True)
    def get_container_logs(container_id: str) -> str:
        """Fetch logs from a Docker container, regardless of whether it is still running or has already exited.

        Args:
            container_id (string): The ID of the Docker container.

        Returns:
            logs (string): The combined stdout and stderr logs from the container.
        """
        try:
            result = subprocess.run(
                ['docker', 'logs', container_id],
                capture_output=True,
                text=True,
                check=True
            )
            logs = result.stdout.strip() + ("\n" + result.stderr.strip() if result.stderr else "")
            return logs.strip()
        except subprocess.CalledProcessError as e:
            return f"Error fetching logs: {e.stderr.strip() if e.stderr else str(e)}"
