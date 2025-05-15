Document doc1 = new Document("color", "red").append("qty", 5);

InsertOneResult result = collection.insertOne(doc1);
System.out.println("Inserted a document with the following id: " 
    + result.getInsertedId().asObjectId().getValue());