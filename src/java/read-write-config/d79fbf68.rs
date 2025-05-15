MongoClient client = MongoClients.create(MongoClientSettings.builder()
        .applyConnectionString(new ConnectionString("mongodb://localhost:27017/"))
        .applyToClusterSettings(builder -> builder.localThreshold(35, TimeUnit.MILLISECONDS))
        .build());