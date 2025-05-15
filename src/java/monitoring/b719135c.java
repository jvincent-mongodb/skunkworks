ConnectionPoolLibrarian cpListener = new ConnectionPoolLibrarian();
MongoClientSettings settings =
        MongoClientSettings.builder()
                .applyConnectionString(URI)
                .applyToConnectionPoolSettings(builder ->
                        builder.addConnectionPoolListener(cpListener))
                .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase(DATABASE);
MongoCollection<Document> collection = database.getCollection(COLLECTION);
// Runs a sample find() command to trigger connection pool events
collection.find().first();