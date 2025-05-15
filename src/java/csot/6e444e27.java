MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(new ConnectionString("<connection string>"))
        .timeout(200L, MILLISECONDS)
        .build();

try (MongoClient mongoClient = MongoClients.create(settings)) {
    MongoDatabase database = mongoClient.getDatabase("db");
    MongoCollection<Document> collection = database.getCollection("people");

    collection.insertOne(new Document("name", "Francine Loews"));
}