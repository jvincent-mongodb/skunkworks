result = collection.create_index([
    ("<field name one>", pymongo.ASCENDING),
    ("<field name two>", pymongo.ASCENDING)
])

print(f"Index created: {result}")