database = client["sample_restaurants"]
collection = database["restaurants"]

async with await collection.watch() as stream:
    async for change in stream:
        print(change)