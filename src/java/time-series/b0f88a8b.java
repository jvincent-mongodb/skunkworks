Document commandResult = database.runCommand(new Document("listCollections", new BsonInt64(1)));

List<String> keys = Arrays.asList("cursor");

// Prints information about the database's collections and views
System.out.println("listCollections: " + commandResult.getEmbedded(keys, Document.class).toJson());