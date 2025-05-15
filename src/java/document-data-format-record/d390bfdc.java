MongoCollection<NetworkDeviceRecord> collection = database.getCollection("network_devices", NetworkDeviceRecord.class);

// insert the record
String deviceId = new ObjectId().toHexString();
collection.insertOne(new NetworkDeviceRecord(deviceId, "Enterprise Wi-fi", "router"));