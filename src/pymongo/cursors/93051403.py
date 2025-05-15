results = collection.find()

async for document in results:
    print(document)