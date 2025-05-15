results = collection.find({ "rating": { "$gt" : 2 }})

for f in results:
    print(f)