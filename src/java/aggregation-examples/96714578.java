collection.aggregate(
    Arrays.asList(
        Aggregates.match(Filters.eq("categories", "Bakery")),
        Aggregates.group("$stars", Accumulators.sum("count", 1))
    )
// Prints the result of the aggregation operation as JSON
).forEach(doc -> System.out.println(doc.toJson()));