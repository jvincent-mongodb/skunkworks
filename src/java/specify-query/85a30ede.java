Bson filter = Filters.size("vendor", 3);

// Retrieves documents that match the filter and prints them as JSON
collection.find(filter).forEach(doc -> System.out.println(doc.toJson()));