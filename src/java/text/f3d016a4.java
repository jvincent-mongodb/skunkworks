Bson filter = Filters.text("fate 7");
collection.find(filter).forEach(doc -> System.out.println(doc.toJson()));