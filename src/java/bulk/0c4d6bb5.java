MongoNamespace peopleNamespace = new MongoNamespace("db", "people");
MongoNamespace thingsNamespace = new MongoNamespace("db", "things");

List<ClientNamespacedWriteModel> bulkOperations = new ArrayList<>();

bulkOperations.add(ClientNamespacedWriteModel.updateOne(
                peopleNamespace,
                Filters.eq("name", "Freya Polk"),
                Updates.inc("age", 1)
        )
);

bulkOperations.add(ClientNamespacedWriteModel.updateMany(
                thingsNamespace,
                Filters.eq("category", "electronic"),
                Updates.set("manufacturer", "Premium Technologies")
        )
);

ClientBulkWriteResult result = mongoClient.bulkWrite(bulkOperations);