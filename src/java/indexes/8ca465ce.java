try {
    IndexOptions indexOptions = new IndexOptions().unique(true);
    String resultCreateIndex = collection.createIndex(Indexes.descending("theaterId"), indexOptions);
    System.out.println(String.format("Index created: %s", resultCreateIndex));

// Prints a message if the "theaterID" field contains duplicate values
} catch (DuplicateKeyException e) {
    System.out.printf("duplicate field values encountered, couldn't create index: \t%s\n", e);
}