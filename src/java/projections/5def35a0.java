Bson filter = Filters.gt("temperatures.avg", 10.1);
Bson projection = fields(include("year"), elemMatch("temperatures"));
collection.find(filter).projection(projection).forEach(doc -> System.out.println(doc.toJson()));