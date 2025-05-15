Bson filter = Filters.eq("color", "pink");
Document document = new Document("color", "orange").append("qty", 25);

// Replaces the first document that matches the filter with a new document
UpdateResult result = collection.replaceOne(filter, document);

// Prints the number of matched and modified documents
System.out.println("Matched document count: " + result.getMatchedCount());
System.out.println("Modified document count: " + result.getModifiedCount());