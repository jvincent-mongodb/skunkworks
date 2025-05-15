MongoCredential credential = MongoCredential.createPlainCredential(<db_username>, "$external", <db_password>);

MongoClient mongoClient = MongoClients.create(
    MongoClientSettings.builder()
        .applyToClusterSettings(builder ->
                builder.hosts(Arrays.asList(new ServerAddress("<hostname>", <port>))))
        .credential(credential)
        .build());