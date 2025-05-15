ClientSessionOptions opts = ClientSessionOptions.builder()
        .defaultTimeout(200L, MILLISECONDS)
        .build();

ClientSession session = mongoClient.startSession(opts);
// ... perform operations on ClientSession