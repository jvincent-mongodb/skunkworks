MongoDatabase database = mongoClient.getDatabase("mydb");
GridFSBucket gridFSBucket = GridFSBuckets.create(database);
gridFSBucket.drop();