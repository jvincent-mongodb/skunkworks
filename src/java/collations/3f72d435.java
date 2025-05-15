MongoCollection<Document> collection = database.getCollection("items");
List<Document> indexes = new ArrayList<>();

collection.listIndexes().into(indexes);

// Prints the collection's indexes and any default collations
indexes.forEach(idx -> System.out.println(idx.toJson()));