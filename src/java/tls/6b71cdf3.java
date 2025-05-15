MongoClient mongoClient = MongoClients.create(
    MongoClientSettings.builder().applyConnectionString(new ConnectionString("<your connection string>"))
    .applyToSslSettings(builder ->
        builder.enabled(true))
    .build());