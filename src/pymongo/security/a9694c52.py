client = pymongo.MongoClient("mongodb://<hostname>:<port>",
                             username="<AWS IAM access key ID>",
                             password="<AWS IAM secret access key>",
                             authMechanism="MONGODB-AWS")