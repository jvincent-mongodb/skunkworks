query_filter = { "<field to match>" : "<value to match>" }
update_operation = { "$set" : 
    { "<field name>" : "<value>" }
}
result = await collection.update_many(query_filter, update_operation)

print(result.modified_count)