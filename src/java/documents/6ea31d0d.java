import com.mongodb.client.model.Filters;
// <MongoCollection setup code here>

BasicDBObject doc =
    collection.find(Filters.eq("name", "Gabriel García Márquez")).first();
if (doc != null) {
    System.out.println("_id: " + doc.getObjectId("_id")
        + ", name: " + doc.getString("name")
        + ", dateOfDeath: " + doc.getDate("dateOfDeath"));

    BasicDBList novels = (BasicDBList) doc.get("novels");
    if (novels != null) {
        BasicDBObject[] novelArr = novels.toArray(new BasicDBObject[0]);
        for (BasicDBObject novel : novelArr) {
            System.out.println("title: " + novel.getString("title")
            + ", yearPublished: " + novel.getInt("yearPublished"));
        }
    }
}