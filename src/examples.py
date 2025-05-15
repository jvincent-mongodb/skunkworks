import os
import uuid
from pymongo import MongoClient

MONGO_USER = os.environ.get('MONGO_USER')
MONGO_PASSWORD = os.environ.get('MONGO_PASSWORD')
MONGO_URI = f'mongodb+srv://{MONGO_USER}:{MONGO_PASSWORD}@m0cluster.h6fulge.mongodb.net/?retryWrites=true&w=majority&appName=M0Cluster'

class GetCodeExamples:
    def __init__(self, colleciton_name):
        self.code_examples = []
        self.client = MongoClient(MONGO_URI)
        self.raw_data = None
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
                    file_extension = i.get('file_extension')
                    unique_id = uuid.uuid4().hex[:8]
                    dir_path = f'{self.collection_name}/{page}'
                    os.makedirs(dir_path, exist_ok=True)
                    with open(f'{dir_path}/{unique_id}{file_extension}', 'w') as f:
                        f.write(code)
