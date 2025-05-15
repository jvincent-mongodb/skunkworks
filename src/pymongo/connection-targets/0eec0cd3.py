from pymongo import AsyncMongoClient

client = AsyncMongoClient("mongodb://<hostname>:<port>",
                           directConnection=True)