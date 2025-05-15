// MongoClient mongoClient = <code to instantiate your client>;

MongoDatabase database = mongoClient.getDatabase("fundamentals_data");
MongoCollection<Document> collection = database.getCollection("authors");

InsertOneResult result = collection.insertOne(author);