Bson textSearch = Aggregates.search(
        SearchOperator.text(
                SearchPath.fieldPath("title"), "Future"));