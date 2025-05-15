try {
    String resultCreateIndex = collection.createIndex(Indexes.geo2dsphere("location.geo"));
    System.out.println(String.format("Index created: %s", resultCreateIndex));

// Prints a message if a geospatial index already exists with a different configuration 
} catch (MongoCommandException e) {
    if (e.getErrorCodeName().equals("IndexOptionsConflict"))
        System.out.println("there's an existing geospatial index with different options");
}