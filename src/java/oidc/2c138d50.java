MongoClient mongoClient = MongoClients.create(
   "mongodb://<hostname>:<port>/" +
   "?authMechanism=MONGODB-OIDC" +
   "&authMechanismProperties=ENVIRONMENT:k8s");