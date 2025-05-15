results = collection.find({ "<field name>" : "<value>" })

async for document in results:
    print(document)