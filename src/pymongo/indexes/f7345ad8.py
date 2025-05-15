search_idx = SearchIndexModel(
    definition ={
        "mappings": {
            "dynamic": True
        }
    },
    name="my_index",
)

vector_idx = SearchIndexModel(
  definition={
    "fields": [
      {
        "type": "vector",
        "numDimensions": <number of dimensions>,
        "path": "<field to index>",
        "similarity": "<select from euclidean, cosine, dotProduct>"
      }
    ]
  },
  name="my_vector_index",
  type="vectorSearch",
)

indexes = [search_idx, vector_idx]

collection.create_search_indexes(models=indexes)