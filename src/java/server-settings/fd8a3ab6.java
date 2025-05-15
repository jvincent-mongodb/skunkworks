ConnectionString connectionString = "mongodb://<host>:<port>/?heartbeatFrequencyMS=15000"
MongoClient mongoClient = MongoClients.create(connectionString)