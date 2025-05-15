MongoCollection<NetworkDeviceRecord> collection = database.getCollection("network_devices", NetworkDeviceRecord.class);

// return all documents in the collection as records
List<NetworkDeviceRecord> records = new ArrayList<NetworkDeviceRecord>();
collection.find().into(records);
records.forEach(System.out::println);