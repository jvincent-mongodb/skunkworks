MongoDatabase database = mongoClient.getDatabase("myDB");
MongoCollection<RecordTree> collection = database.getCollection("myCollection", RecordTree.class);

Bson filter = Filters.eq("left.left.right.content", "Ikatere");
collection.find(filter).forEach(doc -> System.out.println(doc));