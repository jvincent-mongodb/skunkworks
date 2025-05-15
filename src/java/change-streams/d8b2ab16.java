ChangeStreamIterable<Document> changeStream = database.watch()
       .fullDocument(FullDocument.UPDATE_LOOKUP);