from pymongo import AsyncMongoClient

uri = "mongodb://host1:27017/?replicaSet=sampleRS"
client = AsyncMongoClient(uri)