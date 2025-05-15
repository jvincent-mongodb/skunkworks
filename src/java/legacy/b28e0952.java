MongoClient client = MongoClients.create(URI);
MongoDatabase db = client.getDatabase(DATABASE);
MongoCollection<Document> col = db.getCollection(COLLECTION);

// Prints the first document retrieved from the collection as JSON 
Document doc = col.find().first();
System.out.println(doc.toJson());