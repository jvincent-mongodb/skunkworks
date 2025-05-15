Bson filter = Filters.empty();
Bson projection = fields(include("year"), elemMatch("temperatures", Filters.gt("avg", 10.1)));
collection.find(filter).projection(projection).forEach(doc -> System.out.println(doc.toJson()));