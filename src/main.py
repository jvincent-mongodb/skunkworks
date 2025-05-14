from examples import GetCodeExamples
from agent import ExampleCodeDependencyResolver

def main():
    query = None
    get_examples = GetCodeExamples(
                    file_extension=file_extension, 
                    colleciton_name=collection_name)
    get_examples.get_examples()
    get_examples.write_usage_examples_to_local_files()
    # TODO: build query from one page's example code
    resolver = ExampleCodeDependencyResolver()
    resolver.do_stuff(query)
    resolver.print_results()

if __name__ == '__main__':
    collection_name = 'java'
    file_extension = 'java'
    main(collection_name, file_extension)
