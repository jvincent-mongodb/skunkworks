database = client["sample_restaurants"]
collection = database["restaurants"]

with collection.watch() as stream:
    for change in stream:
        print(change)