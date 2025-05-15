UpdateOptions options = UpdateOptions.sort(ascending("color"));
UpdateResult result = collection.updateOne(filter, document, options);