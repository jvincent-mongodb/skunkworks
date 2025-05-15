String resultCreateIndex = collection.createIndex(Indexes.ascending("rated", "genres", "title"));
System.out.println(String.format("Index created: %s", resultCreateIndex));