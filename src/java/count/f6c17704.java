CountOptions opts = new CountOptions().hintString("_id_");
long numDocuments = collection.countDocuments(new BsonDocument(), opts);