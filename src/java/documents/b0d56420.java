// MongoClient mongoClient = <code to instantiate your client>;

JsonObject query = new JsonObject("{\"name\": \"Gabriel Garc\\u00eda M\\u00e1rquez\"}");
JsonObject jsonResult = collection.find(query).first();
if (jsonResult != null) {
    System.out.println("query result in extended json format: " + jsonResult.getJson());
}