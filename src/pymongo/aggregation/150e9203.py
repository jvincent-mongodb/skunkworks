# Define an aggregation pipeline with a match stage and a group stage
pipeline = [
   { "$match": { "cuisine": "Bakery" } },
   { "$group": { "_id": "$borough", "count": { "$sum": 1 } } }
]

# Execute the aggregation
aggCursor = await collection.aggregate(pipeline)

# Print the aggregated results
async for document in aggCursor:
   print(document)