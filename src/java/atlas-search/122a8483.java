List<Bson> pipeline = new ArrayList<>();

pipeline.add(Aggregates.search(
        SearchOperator.compound()
                .filter(
                        List.of(
                                SearchOperator.in(fieldPath("genres"), "Comedy"),
                                SearchOperator.phrase(fieldPath("fullplot"), "new york"),
                                SearchOperator.numberRange(fieldPath("year")).gtLt(1950, 2000),
                                SearchOperator.wildcard(fieldPath("title"), "Love *")
                        ))));

pipeline.add(Aggregates.project(
        Projections.include("title", "year", "genres")
));

AggregateIterable<Document> results = collection.aggregate(pipeline);
results.forEach(doc -> System.out.println(doc.toJson()));