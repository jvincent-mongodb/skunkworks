MongoCollection<DataStorageRecord> collection = database.getCollection("data_storage_devices", DataStorageRecord.class);

// insert the record
collection.insertOne(new DataStorageRecord("2TB SSD", 1.71));