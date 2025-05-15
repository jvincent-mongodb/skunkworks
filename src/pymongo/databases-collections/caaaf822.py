database = client["test_database"]
collection_list = await database.list_collections()

for c in collection_list:
    print(c)