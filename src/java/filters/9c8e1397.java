Bson regexComparison = regex("color", "^p");
collection.find(regexComparison).forEach(doc -> System.out.println(doc.toJson()));