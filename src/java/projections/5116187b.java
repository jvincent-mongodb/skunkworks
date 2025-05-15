Bson filter = Filters.empty();
Bson projection = exclude("temperatures", "type");
collection.find(filter).projection(projection).forEach(doc -> System.out.println(doc.toJson()));