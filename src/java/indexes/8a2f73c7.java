collection.updateSearchIndex("myIndex",
        new Document("analyzer", "lucene.simple").append(
                "mappings",
                new Document("dynamic", false)
                        .append("fields",
                                new Document("title",
                                        new Document("type", "string")))
        )
);