with pymongo.timeout(10):
    collection.insert_one({"name": "Yngwie"})