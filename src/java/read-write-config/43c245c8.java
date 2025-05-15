TransactionOptions tOptions = TransactionOptions.builder()
        .readPreference(ReadPreference.primary())
        .readConcern(ReadConcern.MAJORITY)
        .writeConcern(WriteConcern.W1)
        .build();
        
try (ClientSession clientSession = client.startSession()) {
    clientSession.startTransaction(tOptions);

    // Specify transaction operations here
}