List<WriteModel<Document>> bulkOperations = new ArrayList<>();

// Creates instructions to insert a document
InsertOneModel<Document> insertDoc = new InsertOneModel<>(new Document("_id", 6)
                                                        .append("name", "Zaynab Omar")
                                                        .append("age", 37));

// Creates instructions to replace the first document matched by the query                                       
ReplaceOneModel<Document> replaceDoc = new ReplaceOneModel<>(Filters.eq("_id", 1), 
                                        new Document("name", "Sandy Kane")
                                            .append("location", "Helena, MT")); 

// Creates instructions to update the first document matched by the query                                                                 
UpdateOneModel<Document> updateDoc = new UpdateOneModel<>(Filters.eq("name", "Zaynab Omar"), 
                                        Updates.set("name", "Zaynab Hassan"));

// Creates instructions to delete all documents matched by the query                                
DeleteManyModel<Document> deleteDoc = new DeleteManyModel<>(Filters.gt("age", 50));

bulkOperations.add(insertDoc);
bulkOperations.add(replaceDoc);
bulkOperations.add(updateDoc);
bulkOperations.add(deleteDoc);

// Runs a bulk write operation for the specified the insert, replace, update, and delete WriteModels in order
collection.bulkWrite(bulkOperations);