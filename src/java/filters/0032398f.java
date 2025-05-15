List<String> search = Arrays.asList("A", "D");
Bson allComparison = all("vendor", search);
collection.find(allComparison).forEach(doc -> System.out.println(doc.toJson()));