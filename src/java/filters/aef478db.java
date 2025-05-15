Bson equalComparison = eq("qty", 5);
collection.find(equalComparison).forEach(doc -> System.out.println(doc.toJson()));