results = collection.find({ "name": "Dunkin' Donuts" })

all_results = list(results)

for document in all_results:
    print(document)