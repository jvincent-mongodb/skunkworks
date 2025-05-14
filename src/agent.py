from langchain_openai import AzureChatOpenAI
from langgraph.prebuilt import create_react_agent
from prompt import CODE_DEPENDENCY_RESOLVER_SYSTEM_PROMPT
from tools import ExampleCodeDependencyResolverTools

class ExampleCodeDependencyResolver:
    def __init__(self):
        self.llm = AzureChatOpenAI(
            azure_deployment="gpt-4o", 
            api_version='2024-10-21',
            timeout=60,
            temperature=0,
            max_tokens=None)
        self.system_message = CODE_DEPENDENCY_RESOLVER_SYSTEM_PROMPT
        self.custom_tools = ExampleCodeDependencyResolverTools()
        self.toolkit = self.custom_tools.get_tools()
        self.agent = create_react_agent(
                        self.llm, 
                        self.toolkit, 
                        state_modifier=self.system_message)
        self.messages = []

    def do_stuff(self, query):
        events = self.agent.stream(
            {"messages": [("user", query)]},
            stream_mode="values",
        )
        for event in events:
            self.messages.extend(event["messages"])
    
    def print_results(self):
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
