SSLContext sslContext = ...
MongoClientSettings settings = MongoClientSettings.builder()
     .applyToSslSettings(builder -> {
                 builder.enabled(true);
                 builder.context(sslContext);
             })
     .build();
MongoClient client = MongoClients.create(settings);