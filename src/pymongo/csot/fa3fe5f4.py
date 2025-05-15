with pymongo.timeout(5):
    collection.find_one()
    with pymongo.timeout(3):
        collection.find_one()
    collection.find_one()
    with pymongo.timeout(10):
        collection.find_one()
    collection.find_one()