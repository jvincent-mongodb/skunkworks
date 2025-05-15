FindIterable<Document> cursor = collection.find()
        .collation(Collation.builder().locale("is").build())
        .sort(Sorts.ascending("name"));