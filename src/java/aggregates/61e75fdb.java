Bson matchStage = match(eq("some_field", "some_criteria"));
Bson sortByCountStage = sortByCount("some_field");
collection.aggregate(asList(matchStage, sortByCountStage)).forEach(doc -> System.out.println(doc));