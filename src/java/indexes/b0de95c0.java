MongoDatabase database = mongoClient.getDatabase("tea");
ClusteredIndexOptions clusteredIndexOptions = new ClusteredIndexOptions(new Document("_id", 1), true);
CreateCollectionOptions createCollectionOptions = new CreateCollectionOptions().clusteredIndexOptions(clusteredIndexOptions);

database.createCollection("vendors", createCollectionOptions);