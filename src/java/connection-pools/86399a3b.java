MongoClient mongoClient = MongoClients.create(
    MongoClientSettings.builder().applyConnectionString(
        new ConnectionString("<your connection string>"))
    .applyToConnectionPoolSettings(builder ->
        builder.maxSize(50))
    .build());