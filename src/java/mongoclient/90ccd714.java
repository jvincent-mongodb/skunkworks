MongoClient mongoClient = MongoClients.create(
   MongoClientSettings.builder().applyConnectionString(new ConnectionString("mongodb+srv://<db_username>:<db_password>@<hostname>:<port>/<auth db>?connectTimeoutMS=2000"))
      .applyToSocketSettings(builder ->
      builder.connectTimeout(5L, SECONDS))
      .build());