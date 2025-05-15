import static com.mongodb.client.model.Sorts.ascending;

// <MongoCollection setup code here>

List<Document> results = new ArrayList<>();
collection.find().sort(ascending("_id")).into(results);
for (Document result : results) {
      System.out.println(result.toJson());
}