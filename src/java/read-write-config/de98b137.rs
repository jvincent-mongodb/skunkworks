String connectionString = "mongodb://localhost:27017/?replicaSet=repl0&localThresholdMS=35";
MongoClient client = MongoClients.create(connectionString);