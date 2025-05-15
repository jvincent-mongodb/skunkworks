try (MongoCursor<Document> cursorWithIterationTimeout = collection
        .find(gte("age", 40))
        .timeoutMode(TimeoutMode.ITERATION)
        .cursor()
) {
    while (cursorWithIterationTimeout.hasNext()) {
        System.out.println(cursorWithIterationTimeout.next().toJson());
    }
}