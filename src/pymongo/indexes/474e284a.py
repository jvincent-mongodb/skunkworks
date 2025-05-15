new_index_definition = {
    "mappings": {
        "dynamic": False
    }
}

collection.update_search_index("my_index", new_index)