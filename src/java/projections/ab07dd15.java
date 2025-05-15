Bson filter = Filters.empty();
Bson projection = fields(include("year", "type"), exclude("_id"));
collection.find(filter).projection(projection).forEach(doc -> System.out.println(doc.toJson()));