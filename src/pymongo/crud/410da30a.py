operations = [
    pymongo.InsertOne(
        {
            "<field name>" : "<value>"
        }
    ),
    pymongo.UpdateMany(
        { "<field to match>" : "<value to match>" },
        { "$set" : { "<field name>" : "<value>" }},
    ),
    pymongo.DeleteOne(
        { "<field to match>" : "<value to match>" }
    ),
]

result = collection.bulk_write(operations)

print(result)