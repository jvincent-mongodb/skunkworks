Bson filter = Filters.empty();

// Prints the collection's "color" values and each value's frequency in descending frequency order
collection.aggregate(Arrays.asList(
    Aggregates.match(filter), 
    Aggregates.group("$color", Accumulators.sum("qty", "$qty")),
    Aggregates.sort(Sorts.descending("qty"))))
    .forEach(doc -> System.out.println(doc.toJson()));