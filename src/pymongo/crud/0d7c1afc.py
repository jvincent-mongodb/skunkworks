query_filter = { "<field to match>" : "<value to match>" }

result = collection.delete_one(query_filter)

print(result.deleted_count)