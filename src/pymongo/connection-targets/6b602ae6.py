from pymongo import MongoClient

client = MongoClient("mongodb://<hostname>:<port>",
                     directConnection=True)