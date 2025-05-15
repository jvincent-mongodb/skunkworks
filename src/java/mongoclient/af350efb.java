ConnectionString connectionString = new ConnectionString("mongodb://host1:27017,host2:27017,host3:27017");
MongoClient mongoClient = MongoClients.create(connectionString);