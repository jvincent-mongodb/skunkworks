query_filter = { "<field to match>" : "<value to match>" }
replace_document = { "<new document field name>" : "<new document value>" }

result = collection.replace_one(query_filter, replace_document)

print(result.modified_count)