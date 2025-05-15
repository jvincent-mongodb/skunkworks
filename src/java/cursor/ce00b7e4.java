List<Document> results = new ArrayList<>();
FindIterable<Document> iterable = collection.find();
iterable.into(results);
System.out.println(results);