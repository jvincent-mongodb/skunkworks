MongoCollection<Document> collection = database.getCollection("myColl");

ChangeStreamIterable<Document> changeStream = collection.watch()
        .fullDocument(FullDocument.WHEN_AVAILABLE);

changeStream.forEach(event ->
        System.out.println("Received a change: " + event));