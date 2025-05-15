Bson orComparison = or(gt("qty", 8), eq("color", "pink"));
collection.find(orComparison).forEach(doc -> System.out.println(doc.toJson()));