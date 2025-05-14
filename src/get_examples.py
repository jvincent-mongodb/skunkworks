import os
import uuid
from pymongo import MongoClient

MONGO_URI = os.environ.get('MONGO_URI')

class GetExamples:
    def __init__(self, file_extension, colleciton_name):
        self.code_examples = []
        self.client = MongoClient(MONGO_URI)
        self.raw_data = None
        self.file_extension = file_extension
        self.collection_name = colleciton_name

    def get_examples(self):
        db = self.client["code_metrics"]
        collection = db[self.collection_name]

        results = list(collection.find({}))
        self.raw_data = results

    def write_usage_examples_to_local_files(self):
        for i in self.raw_data:
            page_url = i.get('page_url')
            if page_url:
                page = page_url.split('/')[-1]
            nodes = i.get('nodes')
            if nodes:
                for i in nodes:
                    category = i.get('category')
                    if category != 'Usage example':
                        continue
                    code = i.get('code')
                    unique_id = uuid.uuid4().hex[:8]
                    dir_path = f'{self.collection_name}/{page}'
                    os.makedirs(dir_path, exist_ok=True)
                    with open(f'{dir_path}/{unique_id}.{self.file_extension}', 'w') as f:
                        f.write(code)
