MongoCredential credential = MongoCredential.createAwsCredential("<awsKeyId>", "<awsSecretKey>".toCharArray()).withMechanismProperty("AWS_SESSION_TOKEN",  "<awsSessionToken>");

 // Creates a MongoClient that receives configuration information from a MongoCredential instance
MongoClient mongoClient = MongoClients.create(
        MongoClientSettings.builder()
        .applyToClusterSettings(builder ->
        builder.hosts(Arrays.asList(new ServerAddress("<hostname>"))))
        .credential(credential)
        .build());