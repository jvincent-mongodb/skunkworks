uri = ("mongodb+srv://<percent-encoded AWS IAM access key ID>:"
       "<percent-encoded AWS IAM secret access key>"
       "@<hostname>/?"
       "authMechanismProperties=AWS_SESSION_TOKEN:<AWS session token>"
       "&authMechanism=MONGODB-AWS")
client = pymongo.MongoClient(uri)