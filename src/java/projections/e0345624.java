Bson filter = Filters.empty();
Bson projection = exclude("temperatures");
collection.find(filter).projection(projection).forEach(doc -> System.out.println(doc.toJson()));