MongoCollection<Document> collection = database.getCollection("myColl");

List<Bson> pipeline = Arrays.asList(
        Aggregates.match(Filters.in("operationType", Arrays.asList("insert", "update"))));

ChangeStreamIterable<Document> changeStream = collection.watch(pipeline);
changeStream.forEach(event ->
        System.out.println("Received a change to the collection: " + event));