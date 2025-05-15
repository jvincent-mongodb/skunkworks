String resultCreateIndex = collection.createIndex(Indexes.ascending("location.$**")); 
System.out.println(String.format("Index created: %s", resultCreateIndex));