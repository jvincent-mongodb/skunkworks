Bson filter = Filters.text("even number");
Bson projection = fields(include("year"), metaTextScore("score"));
collection.find(filter).projection(projection).forEach(doc -> System.out.println(doc.toJson()));