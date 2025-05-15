// MongoClient mongoClient = <code to instantiate your client>;

MongoDatabase database = mongoClient.getDatabase("fundamentals_data");
MongoCollection<BasicDBObject> collection = database.getCollection("authors", BasicDBObject.class);

InsertOneResult result = collection.insertOne(author);