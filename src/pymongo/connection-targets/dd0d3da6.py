from pymongo import MongoClient

uri = "mongodb://host1:27017/?replicaSet=sampleRS"
client = MongoClient(uri)