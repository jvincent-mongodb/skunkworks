from pymongo import MongoClient

uri = ("mongodb://<hostname>:<port>/?"
       "directConnection=true")
client = MongoClient(uri)