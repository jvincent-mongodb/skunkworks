import argparse
from examples import GetCodeExamples
from agent import ExampleCodeDependencyResolver

def parse_args():
    args = argparse.ArgumentParser()
    args.add_argument('collection_name')
    args.add_argument('file_extension')
    args = args.parse_args()
    return args

def main(collection_name, file_extension):
    query = None
    get_examples = GetCodeExamples(
                    file_extension=file_extension, 
                    colleciton_name=collection_name)
    get_examples.get_examples()
    get_examples.write_usage_examples_to_local_files()
    # TODO: build query from one page's example code
    agent = ExampleCodeDependencyResolver()
    agent.run(query)
    agent.print_results()

if __name__ == '__main__':
    args = parse_args()
    collection_name = args.collection_name
    file_extension = args.file_extension
    main(collection_name, file_extension)
