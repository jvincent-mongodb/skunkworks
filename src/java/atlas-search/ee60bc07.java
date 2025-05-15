collection.aggregate(
    Arrays.asList(
    	Aggregates.search(SearchOperator.text(
                      SearchPath.fieldPath("title"), "Alabama")),
        Aggregates.project(Projections.include("title"))
    )
).forEach(doc -> System.out.println(doc.toJson()));