from pymongo import AsyncMongoClient

uri = ("mongodb://<hostname>:<port>/?"
       "directConnection=true")
client = AsyncMongoClient(uri)