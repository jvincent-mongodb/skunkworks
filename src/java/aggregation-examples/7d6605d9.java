Document explanation = collection.aggregate(
        Arrays.asList(
                Aggregates.match(Filters.eq("categories", "Bakery")),
                Aggregates.group("$stars", Accumulators.sum("count", 1))
        )
).explain(ExplainVerbosity.EXECUTION_STATS);

String winningPlans = explanation
    .getEmbedded(
        Arrays.asList("queryPlanner", "winningPlan", "queryPlan"),
        Document.class
    )
    .toJson(JsonWriterSettings.builder().indent(true).build());

System.out.println(winningPlans);