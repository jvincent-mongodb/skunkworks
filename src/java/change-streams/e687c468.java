MongoCollection<Document> collection = database.getCollection("myColl");

ChangeStreamIterable<Document> changeStream = collection.watch();
changeStream.forEach(event ->
        System.out.println("Received a change: " + event));