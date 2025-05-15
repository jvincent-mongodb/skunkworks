// MongoClient mongoClient = <code to instantiate your client>;

MongoDatabase database = mongoClient.getDatabase("fundamentals_data");
MongoCollection<BsonDocument> collection = database.getCollection("authors", BsonDocument.class);

InsertOneResult result = collection.insertOne(author);