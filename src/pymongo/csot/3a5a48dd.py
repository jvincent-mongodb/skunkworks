client = MongoClient()
coll = client["test-db"]["test-collection"]
with pymongo.timeout(10):
   coll.insert_one({"name": "Yngwie"})
with pymongo.timeout(10):
   coll.find_one({"name": "Yngwie"})