MongoDatabase database = mongoClient.getDatabase("test_database")
        .withReadPreference(ReadPreference.primaryPreferred())
        .withReadConcern(ReadConcern.AVAILABLE)
        .withWriteConcern(WriteConcern.MAJORITY);