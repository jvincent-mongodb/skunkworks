MongoCollection<Document> collection = database.getCollection("items");
IndexOptions idxOptions = new IndexOptions();

// Defines options that set a collation locale
idxOptions.collation(Collation.builder().locale("en_US").build());

// Creates an index on the "name" field with the collation and ascending sort order
collection.createIndex(Indexes.ascending("name"), idxOptions);