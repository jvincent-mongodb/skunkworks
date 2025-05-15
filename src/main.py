import argparse
import os
from examples import GetCodeExamples
from agent import ExampleCodeDependencyResolver

def parse_args():
    args = argparse.ArgumentParser()
    args.add_argument('collection_name')
    args.add_argument('file_extension')
    args = args.parse_args()
    return args

def build_query(collection_name, directories):
    for i in directories:
        files = os.listdir(f'{collection_name}/{i}')
        with open(f'{collection_name}/{i}/{files[0]}', 'r') as f:
            query = f.read()

    return query

def get_sample_directories(collection_name):
    sample_directories = os.listdir(collection_name)
    return sample_directories

def main(collection_name, file_extension):
    get_examples = GetCodeExamples(
                    file_extension=file_extension, 
                    colleciton_name=collection_name)
    get_examples.get_examples()
    get_examples.write_usage_examples_to_local_files()
    directories = get_sample_directories(collection_name)
    query = build_query(collection_name, directories)
    print(query)

    agent = ExampleCodeDependencyResolver()
    agent.run(query)
    agent.print_results()

if __name__ == '__main__':
    args = parse_args()
    collection_name = args.collection_name
    file_extension = args.file_extension
    main(collection_name, file_extension)
