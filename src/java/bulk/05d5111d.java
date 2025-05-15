MongoNamespace peopleNamespace = new MongoNamespace("db", "people");
MongoNamespace thingsNamespace = new MongoNamespace("db", "things");

List<ClientNamespacedWriteModel> bulkOperations = new ArrayList<>();

bulkOperations.add(ClientNamespacedWriteModel.replaceOne(
                peopleNamespace,
                Filters.eq("_id", 1),
                new Document("name", "Frederic Hilbert")
        )
);

bulkOperations.add(ClientNamespacedWriteModel.replaceOne(
                thingsNamespace,
                Filters.eq("_id", 1),
                new Document("object", "potato")
        )
);

ClientBulkWriteResult result = mongoClient.bulkWrite(bulkOperations);