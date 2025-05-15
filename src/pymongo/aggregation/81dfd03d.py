# Define an aggregation pipeline with a match stage and a group stage
pipeline = [
   { "$match": { "cuisine": "Bakery" } },
   { "$group": { "_id": "$borough", "count": { "$sum": 1 } } }
]

# Execute the operation and print the explanation
result = ExplainableCollection(collection).aggregate(pipeline)
print(result)