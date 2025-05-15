Bson filter = eq("title", "Batman");
Bson sort = Sorts.ascending("title");
Bson projection = fields(include("title"), excludeId());
FindIterable<Document> cursor = collection.find(filter).sort(sort).projection(projection);