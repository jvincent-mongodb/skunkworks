Bson existsComparison = and(exists("qty"), nin("qty", 5, 8));
collection.find(existsComparison).forEach(doc -> System.out.println(doc.toJson()));