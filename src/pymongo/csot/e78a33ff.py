client = MongoClient("mongodb://localhost/?timeoutMS=10000")
coll = client["test-db"]["test-collection"]
coll.insert_one({"name": "Yngwie"})  # Uses the client's 10-second timeout
# pymongo.timeout overrides the client's timeoutMS.
with pymongo.timeout(20):
   coll.insert_one({"name": "Yngwie"})  # Uses the 20-second timeout
with pymongo.timeout(5):
   coll.find_one({"name": "Yngwie"})  # Uses the 5-second timeout