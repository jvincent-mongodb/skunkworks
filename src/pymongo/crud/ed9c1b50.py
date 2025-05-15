document_list = [
   { "<field name>" : "<value>" },
   { "<field name>" : "<value>" }
]

result = collection.insert_many(document_list)

print(result.acknowledged)