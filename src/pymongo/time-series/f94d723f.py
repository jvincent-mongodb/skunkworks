collections = await database.list_collections(filter={'name': 'october2024'})
print(await collections.to_list())