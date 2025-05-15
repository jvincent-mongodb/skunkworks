{
  "mappings": {
    "dynamic": true,
    "fields": {
      "title": {
        "analyzer": "lucene.keyword",
        "type": "string"
      },
      "genres": {
        "normalizer": "lowercase",
        "type": "token"
      }
    }
  }
}