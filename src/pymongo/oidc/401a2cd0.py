properties = {"ENVIRONMENT": "k8s"}
client = MongoClient(
    "mongodb[+srv]://<hostname>:<port>",
    authMechanism="MONGODB-OIDC",
    authMechanismProperties=properties
)