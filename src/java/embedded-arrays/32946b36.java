Bson filter = Filters.eq("qty", 18);
Bson update = Updates.inc("qty.$", -3);

// Defines options that configure the operation to return a document in its post-operation state
FindOneAndUpdateOptions options = new FindOneAndUpdateOptions()
                                    .returnDocument(ReturnDocument.AFTER);

// Updates the first document that matches the filter and prints the updated document as JSON 
Document result = collection.findOneAndUpdate(filter, update, options);
System.out.println(result.toJson());