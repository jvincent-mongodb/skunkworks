MongoClient mongoClient = MongoClients.create(MongoClientSettings.builder()
        .applyConnectionString(new ConnectionString("mongodb://localhost:27017/"))
        .readPreference(ReadPreference.secondary())
        .readConcern(ReadConcern.LOCAL)
        .writeConcern(WriteConcern.W2)
        .build());