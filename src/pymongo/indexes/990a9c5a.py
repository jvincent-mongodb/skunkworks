index = {
    "definition": {
        "mappings": {
            "dynamic": True
        }
    },
    "name": "<index name>",
}

await collection.create_search_index(index)