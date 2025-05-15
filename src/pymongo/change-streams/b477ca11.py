database = client["sample_restaurants"]
collection = database["restaurants"]

async with await collection.watch(full_document='updateLookup') as stream:
    async for change in stream:
        print(change)