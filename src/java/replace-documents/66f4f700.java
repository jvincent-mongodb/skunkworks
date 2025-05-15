ReplaceOptions options = ReplaceOptions.sort(ascending("qty"));
UpdateResult result = collection.replaceOne(filter, document, options);