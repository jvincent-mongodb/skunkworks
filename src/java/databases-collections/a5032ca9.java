MongoDatabase database = mongoClient.getDatabase("testDatabase");
MongoCollection<Document> collection = database.getCollection("testCollection");