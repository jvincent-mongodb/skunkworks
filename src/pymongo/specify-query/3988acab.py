results = collection.find({ 
    "$or": [
        { "qty": { "$gt": 5 }},
        { "color": "yellow" }
    ]
})

for f in results:
    print(f)