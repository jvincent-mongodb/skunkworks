List<Document> documents = new ArrayList<>();

Document doc1 = new Document("color", "red").append("qty", 5);
Document doc2 = new Document("color", "purple").append("qty", 10);

documents.add(doc1);
documents.add(doc2);

InsertManyResult result = collection.insertMany(documents);

// Retrieves and prints the ID values of each inserted document
List<ObjectId> insertedIds = new ArrayList<>();
result.getInsertedIds().values()
    .forEach(doc -> insertedIds.add(doc.asObjectId().getValue()));

System.out.println("Inserted documents with the following ids: " + insertedIds);