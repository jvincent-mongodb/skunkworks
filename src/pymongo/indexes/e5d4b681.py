from pymongo.operations import SearchIndexModel

search_index_model = SearchIndexModel(
  definition={
    "fields": [
      {
        "type": "vector",
        "numDimensions": <number of dimensions>,
        "path": "<field to index>",
        "similarity":  "<select from euclidean, cosine, dotProduct>"
      }
    ]
  },
  name="<index name>",
  type="vectorSearch",
)

await collection.create_search_index(model=search_index_model)