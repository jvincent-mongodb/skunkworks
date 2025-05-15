MongoCredential credential = MongoCredential.createOidcCredential(null)
   .withMechanismProperty("ENVIRONMENT", "gcp")
   .withMechanismProperty("TOKEN_RESOURCE", "<audience>");

MongoClient mongoClient = MongoClients.create(
    MongoClientSettings.builder()
        .applyToClusterSettings(builder ->
                builder.hosts(Arrays.asList(new ServerAddress("<hostname>", <port>))))
        .credential(credential)
        .build());