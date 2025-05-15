ConnectionString connectionString = "mongodb://<host>:<port>/?connectTimeoutMS=15000"
MongoClient mongoClient = MongoClients.create(connectionString)