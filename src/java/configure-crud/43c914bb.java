ConnectionString connectionString = "mongodb://<host>:<port>/?readPreference=nearest"
MongoClient mongoClient = MongoClients.create(connectionString)