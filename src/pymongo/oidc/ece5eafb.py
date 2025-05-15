uri = ("mongodb[+srv]://<hostname>:<port>/?"
       "authMechanism=MONGODB-OIDC"
       "&authMechanismProperties=ENVIRONMENT:k8s")
client = AsyncMongoClient(uri)