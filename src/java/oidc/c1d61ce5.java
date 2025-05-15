MongoCredential credential = MongoCredential.createOidcCredential(null)
   .withMechanismProperty("OIDC_CALLBACK", (context) ->  {
      string accessToken = new String(Files.readAllBytes(Paths.get("access-token.dat"));
      return new OidcCallbackResult(accessToken);
   });

MongoClient mongoClient = MongoClients.create(
    MongoClientSettings.builder()
        .applyToClusterSettings(builder ->
                builder.hosts(Arrays.asList(new ServerAddress("<hostname>", <port>))))
        .credential(credential)
        .build());