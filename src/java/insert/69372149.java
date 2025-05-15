List<Integer> insertedIds = new ArrayList<>();

// Inserts sample documents and prints their "_id" values
try {
    InsertManyResult result = collection.insertMany(documents);  
    result.getInsertedIds().values()
        .forEach(doc -> insertedIds.add(doc.asInt32().getValue()));
    System.out.println("Inserted documents with the following ids: " + insertedIds);

// Prints a message if any exceptions occur during the operation and the "_id" values of inserted documents
} catch(MongoBulkWriteException exception) {
    exception.getWriteResult().getInserts()
        .forEach(doc -> insertedIds.add(doc.getId().asInt32().getValue()));
    System.out.println("A MongoBulkWriteException occurred, but there are " + 
        "successfully processed documents with the following ids: " + insertedIds);
}