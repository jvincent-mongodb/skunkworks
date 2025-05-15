SslContext sslContext = SslContextBuilder.forClient()
        .sslProvider(SslProvider.OPENSSL)
        .build();
MongoClientSettings settings = MongoClientSettings.builder()
        .applyToSslSettings(builder -> builder.enabled(true))
        .transportSettings(TransportSettings.nettyBuilder()
                           .sslContext(sslContext)
                           .build())
        .build();
MongoClient client = MongoClients.create(settings);