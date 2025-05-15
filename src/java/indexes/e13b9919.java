Bson filter = text("java coffee shop");
Bson projection = fields(include("fullplot"), excludeId());
FindIterable<Document> cursor = collection.find(filter).projection(projection);