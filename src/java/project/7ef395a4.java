// return all documents with *only* the name field
Bson filter = Filters.empty();
Bson projection = Projections.fields(Projections.include("name"));
collection.find(filter).projection(projection).forEach(doc -> System.out.println(doc));