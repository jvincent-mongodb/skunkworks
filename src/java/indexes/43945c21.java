Bson filter = and(eq("genres", "Animation"), eq("rated", "G"));
Bson sort = Sorts.ascending("title");
Bson projection = fields(include("title", "rated"), excludeId());
FindIterable<Document> cursor = collection.find(filter).sort(sort).projection(projection);