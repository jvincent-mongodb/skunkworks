Supplier<AwsCredential> awsFreshCredentialSupplier = () -> {
    // Add your code to fetch new credentials

    return new AwsCredential("<awsKeyId>", "<awsSecretKey>", "<awsSessionToken>");
};

// Creates a MongoCredential instance to specify the new AWS credentials
MongoCredential credential = MongoCredential.createAwsCredential(null, null)
        .withMechanismProperty(MongoCredential.AWS_CREDENTIAL_PROVIDER_KEY, awsFreshCredentialSupplier);

// Creates a MongoClient that receives new configuration information from a MongoCredential instance
MongoClient mongoClient = MongoClients.create(
        MongoClientSettings.builder()
        .applyToClusterSettings(builder ->
            builder.hosts(Collections.singletonList(new ServerAddress("<hostname>", <port>))))
        .credential(credential)
        .build());