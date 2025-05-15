Bson filter = Filters.empty();
// second half of the year
Bson projection = slice("temperatures", 6, 6);
collection.find(filter).projection(projection)
        .forEach(doc -> System.out.println(doc.toJson(JsonWriterSettings.builder().indent(true).build())));