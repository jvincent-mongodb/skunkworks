String resultCreateIndex = collection.createIndex(Indexes.ascending("title"));
System.out.println(String.format("Index created: %s", resultCreateIndex));