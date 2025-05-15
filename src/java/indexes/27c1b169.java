try (MongoCursor<Document> resultsCursor = collection.listSearchIndexes().iterator()) {
    while (resultsCursor.hasNext()) {
        System.out.println(resultsCursor.next());
    }
}