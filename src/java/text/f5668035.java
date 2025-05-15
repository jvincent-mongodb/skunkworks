Bson filter = Filters.text("\"fate of the furious\"");
collection.find(filter).forEach(doc -> System.out.println(doc.toJson()));