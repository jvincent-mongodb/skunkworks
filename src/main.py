import os
from langchain_openai import AzureChatOpenAI
from langgraph.prebuilt import create_react_agent
from langchain_mongodb.agent_toolkit import (
    MONGODB_AGENT_SYSTEM_PROMPT,
    MongoDBDatabase,
    MongoDBDatabaseToolkit,
)

from prompt import CODE_DEPENDENCY_RESOLVER_SYSTEM_PROMPT
from tools import ExampleCodeDependencyResolverTools

# ATLAS_CONNECTION_STRING = ''
# ATLAS_DB_NAME = ''

class ExampleCodeDependencyResolver:
    def __init__(self):
        self.llm = AzureChatOpenAI(
            azure_deployment="gpt-4o-mini", 
            api_version='2024-10-21',
            timeout=60,
            temperature=0,
            max_tokens=None)
        self.system_message = CODE_DEPENDENCY_RESOLVER_SYSTEM_PROMPT
        # self.db_wrapper = MongoDBDatabase.from_connection_string(
        #                     ATLAS_CONNECTION_STRING, 
        #                     database=ATLAS_DB_NAME)
        # self.base_toolkit = MongoDBDatabaseToolkit(db=self.db_wrapper, llm=self.llm)
        self.custom_tools = ExampleCodeDependencyResolverTools()
        self.toolkit = self.custom_tools.get_tools()
        # self.toolkit.extend(self.custom_tools.get_tools())
        self.agent = create_react_agent(
                        self.llm, 
                        self.toolkit, 
                        state_modifier=self.system_message)
        self.messages = []

    def do_stuff(self, query):
        # Start the agent with the agent.stream() method
        events = self.agent.stream(
            {"messages": [("user", query)]},
            stream_mode="values",
        )
        # Add output (events) from the agent to the self.state dict
        # Check for keyword 'FROM' to identify dockerfile content and store
        # as latest dockerfile if found
        for event in events:
            self.messages.extend(event["messages"])
    
    def print_results(self):
        # Print the the end-user's expected output from 
        # the final message produced by the agent.
        print(self.messages[-1].content)

def main():
    query = None
    with open('/Users/jeffrey.vincent/skunkworks/example_code/blah.txt', 'r') as f:
        query = f.read()
    resolver = ExampleCodeDependencyResolver()
    resolver.do_stuff(query)
    resolver.print_results()

if __name__ == '__main__':
    main()
