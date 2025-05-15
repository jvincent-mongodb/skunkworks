Bson filter = Filters.text("fast");
collection.find(filter).forEach(doc -> System.out.println(doc.toJson()));