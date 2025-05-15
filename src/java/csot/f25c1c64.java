MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(new ConnectionString("<connection string>"))
        .timeout(200L, MILLISECONDS)
        .build();

MongoClient mongoClient = MongoClients.create(settings);