MongoChangeStreamCursor<ChangeStreamDocument<Document>> cursor = changeStream.cursor();
SplitEvent event = cursor.tryNext().getSplitEvent();