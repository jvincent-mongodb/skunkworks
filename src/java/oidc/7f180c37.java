MongoClient mongoClient = MongoClients.create(
   "mongodb://<db_username>@<hostname>:<port>/?" +
   "?authMechanism=MONGODB-OIDC" +
   "&authMechanismProperties=ENVIRONMENT:azure,TOKEN_RESOURCE:<percent-encoded audience>");