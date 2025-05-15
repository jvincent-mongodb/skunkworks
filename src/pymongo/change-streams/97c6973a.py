database = client["sample_restaurants"]
collection = database["restaurants"]

with collection.watch(full_document='updateLookup') as stream:
    for change in stream:
        print(change)