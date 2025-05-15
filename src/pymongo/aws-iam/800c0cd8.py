uri = ("mongodb+srv://<percent-encoded AWS IAM access key ID>:"
       "<percent-encoded AWS IAM secret access key>"
       "@<hostname>/?"
       "&authMechanism=MONGODB-AWS")
client = pymongo.AsyncMongoClient(uri)