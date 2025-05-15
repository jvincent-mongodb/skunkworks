ChangeStreamIterable<Document> changeStream = collection.watch(
      List.of(Document.parse("{ $changeStreamSplitLargeEvent: {} }")));