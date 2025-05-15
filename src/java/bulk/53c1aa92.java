MongoNamespace namespace = new MongoNamespace("db", "people");

ClientBulkWriteOptions options = ClientBulkWriteOptions
        .clientBulkWriteOptions()
        .ordered(false);

List<ClientNamespacedWriteModel> bulkOperations = new ArrayList<>();

bulkOperations.add(
        ClientNamespacedWriteModel.insertOne(
                namespace,
                new Document("_id", 1).append("name", "Rudra Suraj")
        )
);

// Causes a duplicate key error
bulkOperations.add(
        ClientNamespacedWriteModel.insertOne(
                namespace,
                new Document("_id", 1).append("name", "Mario Bianchi")
        )
);

bulkOperations.add(
        ClientNamespacedWriteModel.insertOne(
                namespace,
                new Document("name", "Wendy Zhang")
        )
);

ClientBulkWriteResult result = mongoClient.bulkWrite(bulkOperations, options);