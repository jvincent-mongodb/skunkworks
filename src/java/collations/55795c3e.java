Bson groupStage = Aggregates.group("$first_name", Accumulators.sum("nameCount", 1));
Bson sortStage = Aggregates.sort(Sorts.ascending("_id"));

AggregateIterable<Document> results = collection
        // Runs the aggregation pipeline that includes tallying "first_name" frequencies
        .aggregate(Arrays.asList(groupStage, sortStage))

        // Applies a collation to sort documents alphabetically by using the German locale, ignoring accents
        .collation(Collation.builder().locale("de").collationStrength(CollationStrength.PRIMARY).build());

// Prints the JSON representation of the results
if (results != null) {
    results.forEach(doc -> System.out.println(doc.toJson()));
}