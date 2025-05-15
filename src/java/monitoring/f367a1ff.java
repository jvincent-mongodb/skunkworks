MongoClientSettings settings =
        MongoClientSettings.builder()
                .applyConnectionString(URI)
                .addCommandListener(new CommandCounter())
                .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase(DATABASE);
MongoCollection<Document> collection = database.getCollection(COLLECTION);
// Runs sample find() commands to test the timer
collection.find().first();
collection.find().first();
mongoClient.close();