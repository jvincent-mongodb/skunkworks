TextSearchOptions options = new TextSearchOptions().caseSensitive(true);
Bson filter = Filters.text("SomeText", options);