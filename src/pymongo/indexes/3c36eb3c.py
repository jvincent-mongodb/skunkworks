result = collection.create_index(
    [( "<field name>", "text")],
    default_language="english",
    weights={ "<field name>": 10 }
)
   
print(f"Index created: {result}")