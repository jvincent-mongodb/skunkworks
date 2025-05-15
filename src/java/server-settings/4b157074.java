MongoClient mongoClient = MongoClients.create(
    MongoClientSettings.builder().applyConnectionString(new ConnectionString("<your connection string>"))
    .applyToServerSettings(builder ->
        builder.minHeartbeatFrequency(700, MILLISECONDS)
        .heartbeatFrequency(15, SECONDS))
    .build());