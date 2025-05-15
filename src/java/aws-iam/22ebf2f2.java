MongoCredential credential = MongoCredential.createAwsCredential("<awsKeyId>", "<awsSecretKey>".toCharArray());

// Creates a MongoClient that receives AWS credentials from the MongoCredential instance
MongoClient mongoClient = MongoClients.create(
        MongoClientSettings.builder()
        .applyToClusterSettings(builder ->
        builder.hosts(Arrays.asList(new ServerAddress("<hostname>"))))
        .credential(credential)
        .build());