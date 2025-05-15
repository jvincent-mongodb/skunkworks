Bson filter = and(eq("type", "movie"), eq("rated", "G"));
Bson sort = Sorts.ascending("type", "rated");
Bson projection = fields(include("type", "rated"), excludeId());
FindIterable<Document> cursor = collection.find(filter).sort(sort).projection(projection);