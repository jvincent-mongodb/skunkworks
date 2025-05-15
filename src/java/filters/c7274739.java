Bson emptyComparison = empty();
collection.find(emptyComparison).forEach(doc -> System.out.println(doc.toJson()));