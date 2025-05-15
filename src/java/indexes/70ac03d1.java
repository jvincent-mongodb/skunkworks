try {
    String resultCreateIndex = collection.createIndex(Indexes.text("plot"));
    System.out.println(String.format("Index created: %s", resultCreateIndex));

// Prints a message if a text index already exists with a different configuration 
} catch (MongoCommandException e) {
    if (e.getErrorCodeName().equals("IndexOptionsConflict"))
        System.out.println("there's an existing text index with different options");
}