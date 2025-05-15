query_filter = { "<field to match>" : "<value to match>" }
update_operation = { "$set" : 
    { "<field name>" : "<value>" }
}
result = collection.update_one(query_filter, update_operation)

print(result.modified_count)