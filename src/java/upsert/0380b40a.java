// Creates a filter and update document to increment the matching document's "qty" value
Bson filter = Filters.eq("color", "orange");
Bson update = Updates.inc("qty", 10);

// Updates the matching document or inserts a document if none match the query filter
UpdateOptions options = new UpdateOptions().upsert(true);
System.out.println(collection.updateOne(filter, update, options));