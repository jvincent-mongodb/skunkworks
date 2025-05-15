Document searchIdx = new Document("mappings",
        new Document("dynamic", true));
collection.createSearchIndex("myIndex", searchIdx);