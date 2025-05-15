MongoClient mongoClient = MongoClients.create(
    MongoClientSettings.builder().applyConnectionString(new ConnectionString("<your connection string>"))
    .applicationName("<application name>")
    .applyToLoggerSettings(builder ->
         builder.maxDocumentLength(5_000))
    .build());