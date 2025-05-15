new_index = {
    "definition": {
        "mappings": {
            "dynamic": True
        }
    },
    "name": "<index name>",
}

collection.update_search_index("<name of index to update>", new_index)

print(f"Search index updated: {result}")