uri = ("mongodb://<percent-encoded AWS IAM access key ID>:"
       "<percent-encoded AWS IAM secret access key>"
       "@<hostname>:<port>/?"
       "&authMechanism=MONGODB-AWS")
client = pymongo.MongoClient(uri)