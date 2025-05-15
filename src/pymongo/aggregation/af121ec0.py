# Define an aggregation pipeline with a match stage and a group stage
pipeline = [
   { $match: { cuisine: "Bakery" } },
   { $group: { _id: "$borough", count: { $sum: 1 } } }
]

# Execute the operation and print the explanation
result = database.command("aggregate", "collection", pipeline=pipeline, explain=True)
print(result)