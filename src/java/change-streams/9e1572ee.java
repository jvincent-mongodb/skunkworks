List<Bson> pipeline = List.of(
                        Aggregates.match(
                           Filters.in("operationType",
                                 List.of("insert", "update"))),
                        Aggregates.match(
                           Filters.lt("fullDocument.runtime", 15)));
ChangeStreamIterable<Document> changeStream = database.watch(pipeline);