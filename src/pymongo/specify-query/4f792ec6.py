results = collection.find({
    "type" : { "$size": 2 }
})

for f in results:
    print(f)