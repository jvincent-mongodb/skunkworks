Bson filter = Filters.empty();
Bson projection = include("year", "type");
collection.find(filter).projection(projection).forEach(doc -> System.out.println(doc.toJson()));