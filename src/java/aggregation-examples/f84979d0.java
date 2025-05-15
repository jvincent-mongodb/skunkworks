collection.aggregate(
    Arrays.asList(
        Aggregates.project(
            Projections.fields(
                Projections.excludeId(),
                Projections.include("name"),
                Projections.computed(
                    "firstCategory",
                    new Document(
                        "$arrayElemAt", 
                        Arrays.asList("$categories", 0)
                    )
                )
            )
        )
    )
).forEach(doc -> System.out.println(doc.toJson()));