Bson filter = Filters.eq("color", "orange");
Bson update = Updates.inc("qty", 10);
System.out.println(collection.updateOne(filter, update));