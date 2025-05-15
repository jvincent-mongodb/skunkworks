MongoNamespace peopleNamespace = new MongoNamespace("db", "people");
MongoNamespace thingsNamespace = new MongoNamespace("db", "things");

List<ClientNamespacedWriteModel> bulkOperations = new ArrayList<>();

bulkOperations.add(ClientNamespacedWriteModel
        .insertOne(
                peopleNamespace,
                new Document("name", "Julia Smith")
        )
);

bulkOperations.add(ClientNamespacedWriteModel
        .insertOne(
                thingsNamespace,
                new Document("object", "washing machine")
        )
);

ClientBulkWriteResult result = mongoClient.bulkWrite(bulkOperations);