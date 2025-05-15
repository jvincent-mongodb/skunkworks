Bson filter = Filters.empty();
Bson update = Updates.inc("qty", 20);

// Updates all documents and prints the number of matched and modified documents
UpdateResult result = collection.updateMany(filter, update);
System.out.println("Matched document count: " + result.getMatchedCount());
System.out.println("Modified document count: " + result.getModifiedCount());