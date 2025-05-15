Bson filter = Filters.text("furious -fast");
collection.find(filter).forEach(doc -> System.out.println(doc.toJson()));