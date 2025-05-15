Bson filter = Filters.empty();
Bson projection = Projections.fields(Projections.include("name", "rating"), Projections.excludeId());
collection.find(filter).projection(projection).forEach(doc -> System.out.println(doc));