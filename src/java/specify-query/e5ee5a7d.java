Bson filter = Filters.gt("qty", 7);

// Retrieves documents that match the filter and prints them as JSON
collection.find(filter).forEach(doc -> System.out.println(doc.toJson()));