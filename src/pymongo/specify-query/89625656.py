results = collection.find({ "name" : { "$regex" : "p{2,}" }} )

for f in results:
    print(f)