document_list = [
   { "<field name>" : "<value>" },
   { "<field name>" : "<value>" }
]

result = await collection.insert_many(document_list)

print(result.acknowledged)