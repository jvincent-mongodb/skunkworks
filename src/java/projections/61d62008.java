Bson filter = Filters.empty();
Bson projection = fields(include("year", "type"), excludeId());
collection.find(filter).projection(projection).forEach(doc -> System.out.println(doc.toJson()));