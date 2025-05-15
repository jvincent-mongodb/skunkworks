MongoCredential credential = MongoCredential.createOidcCredential(null)
   .withMechanismProperty("ENVIRONMENT", "k8s");

MongoClient mongoClient = MongoClients.create(
   MongoClientSettings.builder()
      .applyToClusterSettings(builder ->
             builder.hosts(Arrays.asList(new ServerAddress("<hostname>", <port>))))
      .credential(credential)
      .build());