MongoClient mongoClient = MongoClients.create(
    MongoClientSettings.builder()
        .applyConnectionString(
                new ConnectionString("mongodb+srv://myDatabaseUser:myPassword@example.org/"))
        .applyToSocketSettings(builder ->
                builder.applyToProxySettings(proxyBuilder ->
                        proxyBuilder
                            .host("<proxyHost>")
                            .port(<proxyPort>)
                            .username("<proxyUsername>")
                            .password("<proxyPassword>")
                        )
        ).build());