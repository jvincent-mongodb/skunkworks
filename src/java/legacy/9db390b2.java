MongoClientSettings options = MongoClientSettings.builder()
        .applyConnectionString(new ConnectionString(URI))
        .writeConcern(WriteConcern.W1).build();
MongoClient client = MongoClients.create(options);