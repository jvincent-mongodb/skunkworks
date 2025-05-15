Cursor cursor = collection.aggregate(Arrays.asList(
        new BasicDBObject("$collStats",
                new BasicDBObject("storageStats", new BasicDBObject()))),
        AggregationOptions.builder().build()
);