MongoCredential credential = MongoCredential.createOidcCredential("<db_username>")
   .withMechanismProperty("ENVIRONMENT", "azure")
   .withMechanismProperty("TOKEN_RESOURCE", "<audience>");

MongoClient mongoClient = MongoClients.create(
    MongoClientSettings.builder()
        .applyToClusterSettings(builder ->
                builder.hosts(Arrays.asList(new ServerAddress("<hostname>", <port>))))
        .credential(credential)
        .build());