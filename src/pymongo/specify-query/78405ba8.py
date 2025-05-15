results = collection.find( { "color" : { "$exists": "true" }} )

for f in results:
    print(f)