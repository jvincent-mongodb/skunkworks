FindIterable<Document> iterable = collection.find();
iterable.forEach(doc -> System.out.println(doc.toJson()));