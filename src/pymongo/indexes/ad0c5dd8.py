new_index_definition = {
    "fields": [
        {
            "type": "vector",
            "numDimensions": 1536,
            "path": "<field to index>",
            "similarity": "euclidean"
        },
    ]
}

await collection.update_search_index("my_vector_index", new_index_definition)