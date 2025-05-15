MongoCollection<Document> collection = database.getCollection("test_collection")
        .withReadPreference(ReadPreference.secondaryPreferred())
        .withReadConcern(ReadConcern.AVAILABLE)
        .withWriteConcern(WriteConcern.UNACKNOWLEDGED);