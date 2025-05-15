results = await collection.distinct("<field name>")

for document in results:
    print(document)