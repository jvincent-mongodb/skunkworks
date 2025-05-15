results = await (await collection.list_search_indexes()).to_list()

async for index in results:
    print(index)