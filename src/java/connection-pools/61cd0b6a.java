ConnectionString connectionString = "mongodb://<host>:<port>/?maxPoolSize=50"
MongoClient mongoClient = MongoClients.create(connectionString)