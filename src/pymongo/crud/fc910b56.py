query_filter = { "<field to match>" : "<value to match>" }

result = collection.delete_many(query_filter)

print(result.deleted_count)