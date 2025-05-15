Bson compoundIndexExample = compoundIndex(descending("capacity", "year"), ascending("name"));
collection.createIndex(compoundIndexExample);