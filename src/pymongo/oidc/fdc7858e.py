client = AsyncMongoClient(
   "mongodb[+srv]://<hostname>:<port>",
   authMechanism="MONGODB-OIDC",
   authMechanismProperties=properties
)