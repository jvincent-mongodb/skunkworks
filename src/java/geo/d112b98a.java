// <MongoCollection setup code here>
collection.createIndex(Indexes.geo2dsphere("location.geo"));