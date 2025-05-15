import static org.bson.codecs.configuration.CodecRegistries.fromCodecs;

// MongoClient mongoClient = <code to instantiate your client>;

MongoDatabase database = mongoClient.getDatabase("fundamentals_data");
MongoCollection<JsonObject> collection = database.getCollection("authors", JsonObject.class)
        .withCodecRegistry(
                fromCodecs(
                        // define a JsonObjectCodec with a JsonWriterSettings in Relaxed mode
                        new JsonObjectCodec(JsonWriterSettings
                                .builder()
                                .outputMode(JsonMode.RELAXED)
                                .objectIdConverter((objectId, strictJsonWriter) -> {
                                    strictJsonWriter.writeString(objectId.toHexString());
                                })
                                .build())));
JsonObject author = new JsonObject("{\"_id\": \"6035210f35bd203721c3eab8\", "
        + "\"name\": \"Gabriel García Márquez\", "
        + "\"dateOfDeath\": {\"$date\": \"2014-04-17T04:00:00Z\"}, "
        + "\"novels\": [{\"title\": \"One Hundred Years of Solitude\", \"yearPublished\": 1967},
                        {\"title\": \"Chronicle of a Death Foretold\", \"yearPublished\": 1981}, "
        + "{\"title\": \"Love in the Time of Cholera\", \"yearPublished\": 1985}]}\n");
collection.insertOne(author);
JsonObject query = new JsonObject("{\"name\": \"Gabriel Garc\\u00eda M\\u00e1rquez\"}");
JsonObject jsonResult = collection.find(query).first();
if (jsonResult != null) {
    System.out.println("query result in relaxed json format: " + jsonResult.getJson());
}