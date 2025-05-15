String uri = "mongodb://<db_username>:<db_password>@<hostname>:<port>/?authSource=users&authMechanism=SCRAM-SHA-256";
MongoClient mongoClient = MongoClients.create(uri);