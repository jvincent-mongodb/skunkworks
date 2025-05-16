A tool for automating the creation of container images for testing code snippets 
in the MongoDB Docs. 

The tool queries an Atlas cluster with code examples that have been scraped from 
the docs and filters results to only include usage examples.
It then writes the code examples to local files organized by the filename of the 
page in the docs on which a given set of usage examples appear.

It then generates a Dockerfile for one code example per page group, with the 
assumption being that the code examples will have similar dependencies. After 
generating the Dockerfile, it builds the image and runs the resulting container. 

It then checks the log output from the container to determine if the code 
compiled and ran successfully, or if it did not. If it did not, the agent 
determines whether the failure was due to missing dependencies in the Docker image. 
If the cause of failure was missing dependencies, the agent iterates on the above 
process until all dependencies are satisfied and the code in the container compiles 
(or it "spins its wheels" long enough to build a long enough chat history that 
it exceeds the token limit for the API lol :) ) To reduce the liklihood of this 
result, I have simplified the agent's assigned task, and the larger flow will 
likely require a separate agent to perform the next stage of the process of 
building and potentially maintaining a library of test containers for code 
examples in the MongoDB docs.

But yeah, that's what it does and how it works. 

The afore mentioned second tool could take the newly minted Dockerfiles and confirm 
that they include the required dependencies to run each of the code examples on 
a given docs page or even product section, such that there will be a common test 
container for multiple code examples, but that is beyond the scope of this 
Skunkworks project. 

## Example Usage

### Set the env vars

```
export AZURE_OPENAI_ENDPOINT=<api-endpoint>
export AZURE_OPENAI_API_KEY=<api-key>
export MONGO_USER=<mongo-user>
export MONGO_PASSWORD=<mongo-password>
```

### Run the agent workflow

```
python main.py django /Users/jeffrey.vincent/skunkworks
```