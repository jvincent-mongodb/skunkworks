String resultCreateIndex = collection.createIndex(Indexes.ascending("type", "rated"));
System.out.println(String.format("Index created: %s", resultCreateIndex));