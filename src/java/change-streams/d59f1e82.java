MongoCollection<Document> collection = database.getCollection("myColl");

ChangeStreamIterable<Document> changeStream = collection.watch()
        .fullDocumentBeforeChange(FullDocumentBeforeChange.REQUIRED);

changeStream.forEach(event ->
        System.out.println("Received a change: " + event));