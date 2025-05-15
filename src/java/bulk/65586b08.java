try {
    List<WriteModel<Document>> bulkOperations = new ArrayList<>();

    // Creates instructions to insert documents
    InsertOneModel<Document> doc1 = new InsertOneModel<>(new Document("_id", 1));
    InsertOneModel<Document> doc3 = new InsertOneModel<>(new Document("_id", 3));
    
    bulkOperations.add(doc1);
    bulkOperations.add(doc3);
    
    // Runs a bulk write operation for the specified insert WriteModels
    collection.bulkWrite(bulkOperations); 

// Prints a message if any exceptions occur during the bulk write operation
} catch (MongoBulkWriteException e){
    System.out.println("A MongoBulkWriteException occurred with the following message: " + e.getMessage());
}