from pymongo import MongoClient

client = MongoClient()
client.test.test.insert_one({'binary': b'this is a byte string'})
doc = client.test.test.find_one()
print(doc)