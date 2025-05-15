ConnectionString connectionString = "mongodb://<host>:<port>/?directConnection=true"
MongoClient mongoClient = MongoClients.create(connectionString)