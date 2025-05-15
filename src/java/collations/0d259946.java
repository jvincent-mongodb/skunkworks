FindIterable<Document> cursor = collection.find()
        .collation(Collation.builder().locale("en_US").build())
        .sort(Sorts.ascending("name"));