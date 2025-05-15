client = pymongo.AsyncMongoClient("mongodb+srv://<hostname>",
                                  username="<AWS IAM access key ID>",
                                  password="<AWS IAM secret access key>",
                                  authMechanism="MONGODB-AWS")