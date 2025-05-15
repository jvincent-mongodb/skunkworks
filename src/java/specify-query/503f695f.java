Bson filter = Filters.and(Filters.lte("qty", 5), Filters.ne("color", "pink"));

// Retrieves documents that match the filter and prints them as JSON
collection.find(filter).forEach(doc -> System.out.println(doc.toJson()));