Bson bitsComparison = bitsAllSet("a", 34);
collection.find(bitsComparison).forEach(doc -> System.out.println(doc.toJson()));