results = list(collection.list_search_indexes())

print('Existing search indexes:\n')
for index in results:
    print(index)