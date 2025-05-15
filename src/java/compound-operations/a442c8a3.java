// <MongoCollection set up code here>

// Creates instructions to replace the matching document with a new document
Bson filter = Filters.eq("color", "green");
Document replace = new Document("music", "classical").append("color", "green");

// Defines options specifying that the operation should return a document in its post-operation state
FindOneAndReplaceOptions options = new FindOneAndReplaceOptions().
        returnDocument(ReturnDocument.AFTER);

// Atomically finds and replaces the matching document and prints the replacement document
Document result = collection.findOneAndReplace(filter, replace, options);
System.out.println(result.toJson());