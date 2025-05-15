MongoCredential credential = MongoCredential.createAwsCredential(null, null);

// Creates a MongoClient that receives configuration information from a MongoCredential and environment variables
MongoClient mongoClient = MongoClients.create(
        MongoClientSettings.builder()
        .applyToClusterSettings(builder ->
        builder.hosts(Arrays.asList(new ServerAddress("<hostname>"))))
        .credential(credential)
        .build());