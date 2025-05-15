MongoClient mongoClient = MongoClients.create(uri);
MongoDatabase database = mongoClient.getDatabase("sample_pojos").withCodecRegistry(pojoCodecRegistry);