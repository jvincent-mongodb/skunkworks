IsWriteable clusterListener = new IsWriteable();
MongoClientSettings settings =
        MongoClientSettings.builder()
                .applyConnectionString(URI)
                .applyToClusterSettings(builder ->
                        builder.addClusterListener(clusterListener))
                .build();
MongoClient mongoClient = MongoClients.create(settings);
MongoDatabase database = mongoClient.getDatabase(DATABASE);
MongoCollection<Document> collection = database.getCollection(COLLECTION);
// Runs a sample find() command to trigger a ClusterDescriptionChangedEvent event
collection.find().first();