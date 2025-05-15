MongoClient client = new MongoClient(URI);
DB db = client.getDB(DATABASE);
DBCollection col = db.getCollection(COLLECTION);

// Retrieves one document in the collection and prints it
DBObject doc = col.find().one();
System.out.println(doc.toString());