MongoClient mongoClient = MongoClients.create(
    MongoClientSettings.builder()
    .applyConnectionString(new ConnectionString("<your connection string>"))
    .applyToSocketSettings(builder ->
        builder.connectTimeout(10, SECONDS)
        .readTimeout(15, SECONDS))
    .build());