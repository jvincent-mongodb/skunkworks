MongoClient mongoClient = MongoClients.create(
        MongoClientSettings.builder().applyConnectionString(new ConnectionString("<your connection string>"))
                .readPreference(ReadPreference.nearest())
                .build());