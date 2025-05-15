Bson filter = new Document().append("gender", "female").append("age", new Document().append("$gt", 29));
Bson projection = new Document().append("_id", 0).append("email", 1);
collection.find(filter).projection(projection);