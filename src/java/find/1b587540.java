Bson filter = Filters.and(Filters.gt("qty", 3), Filters.lt("qty", 9));

// Retrieves documents that match the filter and prints them as JSON
collection.find(filter).forEach(doc -> System.out.println(doc.toJson()));