MongoCollection<DataStorageRecord> collection = database.getCollection("data_storage_devices", DataStorageRecord.class);

// retrieve and print the records
List<DataStorageRecord> records = new ArrayList<DataStorageRecord>();
collection.find().into(records);
records.forEach(System.out::println);