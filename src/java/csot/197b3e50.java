FindIterable<Document> cursorWithLifetimeTimeout = collection
        .find(gte("age", 40))
        .timeoutMode(TimeoutMode.CURSOR_LIFETIME);