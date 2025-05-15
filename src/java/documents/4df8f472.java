import com.mongodb.client.model.Filters;
// <MongoCollection setup code here>

Document doc = collection.find(Filters.eq("name", "Gabriel García Márquez")).first();
if (doc != null) {
    System.out.println("_id: " + doc.getObjectId("_id")
        + ", name: " + doc.getString("name")
        + ", dateOfDeath: " + doc.getDate("dateOfDeath"));

    doc.getList("novels", Document.class).forEach((novel) -> {
        System.out.println("title: " + novel.getString("title")
            + ", yearPublished: " + novel.getInteger("yearPublished"));
        });
}