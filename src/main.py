import argparse
import os
from examples import GetCodeExamples
from agent import ExampleCodeDependencyResolver

def parse_args():
    args = argparse.ArgumentParser()
    args.add_argument('collection_name')
    args.add_argument('dockerfiles_directory_path')
    args = args.parse_args()
    return args

def build_queries(collection_name, directories, dockerfiles_directory_path):
    queries = []
    existing_dockerfiles = os.listdir(dockerfiles_directory_path)
    for i in directories:
        if i not in existing_dockerfiles:
            files = os.listdir(f'{collection_name}/{i}')
            with open(f'{collection_name}/{i}/{files[0]}', 'r') as f:
                q = {}
                q['query'] = f.read()
                q['dir_name'] = i
                queries.append(q)
    return queries

def get_sample_directories(collection_name):
    sample_directories = os.listdir(collection_name)
    return sample_directories

def main(collection_name, dockerfiles_directory_path):
    get_examples = GetCodeExamples(
                    colleciton_name=collection_name)
    get_examples.get_examples()
    get_examples.write_usage_examples_to_local_files()
    directories = get_sample_directories(collection_name)
    queries = build_queries(collection_name, directories, dockerfiles_directory_path)
    agent = ExampleCodeDependencyResolver()
    for i in queries:
        os.environ['OUTPUT_DIR'] = i['dir_name']
        agent.run(i['query'])
        agent.print_results()

if __name__ == '__main__':
    args = parse_args()
    collection_name = args.collection_name
    dockerfiles_directory_path = args.dockerfiles_directory_path
    os.environ['DOCKERFILES_DIR'] = dockerfiles_directory_path
    main(collection_name, dockerfiles_directory_path)
