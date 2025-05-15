import com.mongodb.client.model.Filters;

// <MongoCollection setup code here>

BsonDocument doc = collection.find(Filters.eq("name", "Gabriel García Márquez")).first();
if (doc != null) {
    System.out.println("_id: " + doc.getObjectId("_id").getValue()
            + ", name: " + doc.getString("name").getValue()
            + ", dateOfDeath: " + new Date(doc.getDateTime("dateOfDeath").getValue()));

    doc.getArray("novels").forEach((novel) -> {
        System.out.println("title: " + novel.asDocument().getString("title").getValue()
                + ", yearPublished: " + novel.asDocument().getInt32("yearPublished").getValue());
    });
}