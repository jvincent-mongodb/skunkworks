Document explanation = collection.find().explain(ExplainVerbosity.EXECUTION_STATS);
List<String> keys = Arrays.asList("queryPlanner", "winningPlan");
System.out.println(explanation.getEmbedded(keys, Document.class).toJson());