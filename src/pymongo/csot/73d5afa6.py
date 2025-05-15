with pymongo.timeout(10):
    coll.insert_one({"name": "Yngwie"})
    coll.find_one({"name": "Yngwie"})