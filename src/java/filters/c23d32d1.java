Bson gteComparison = gte("qty", 10);
collection.find(gteComparison).forEach(doc -> System.out.println(doc.toJson()));