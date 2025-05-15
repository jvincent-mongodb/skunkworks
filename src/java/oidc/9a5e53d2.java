MongoClient mongoClient = MongoClients.create(
   "mongodb://<hostname>:<port>/?" +
   "authMechanism=MONGODB-OIDC" +
   "&authMechanismProperties=ENVIRONMENT:gcp,TOKEN_RESOURCE:<percent-encoded audience>");