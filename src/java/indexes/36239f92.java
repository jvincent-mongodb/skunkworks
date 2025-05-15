SearchIndexModel searchIdxMdl = new SearchIndexModel(
    "searchIdx",
    new Document("analyzer", "lucene.standard").append(
        "mappings", new Document("dynamic", true)),
    SearchIndexType.search()
);

SearchIndexModel vectorSearchIdxMdl = new SearchIndexModel(
    "vsIdx",
    new Document(
        "fields",
        Arrays.asList(
            new Document("type", "vector")
                .append("path", "embeddings")
                .append("numDimensions", 1536)
                .append("similarity", "dotProduct")
        )
    ),
    SearchIndexType.vectorSearch()
);

collection.createSearchIndexes(
    Arrays.asList(searchIdxMdl, vectorSearchIdxMdl)
);