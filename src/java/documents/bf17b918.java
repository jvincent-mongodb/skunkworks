// MongoClient mongoClient = <code to instantiate your client>;

MongoDatabase database = mongoClient.getDatabase("fundamentals_data");
MongoCollection<JsonObject> collection = database.getCollection("authors", JsonObject.class);

InsertOneResult result = collection.insertOne(author);