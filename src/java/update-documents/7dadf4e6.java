Bson filter = Filters.eq("qty", 0);
Bson update = Updates.set("color", "dandelion");

// Updates first matching document
UpdateResult result = collection.updateOne(filter, update);