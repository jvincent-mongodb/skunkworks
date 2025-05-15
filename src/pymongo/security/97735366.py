client = pymongo.AsyncMongoClient("mongodb://@<hostname>:<port>",
                                  username="<AWS IAM access key ID>",
                                  password="<AWS IAM secret access key>",
                                  authMechanismProperties="AWS_SESSION_TOKEN:<AWS session token>",
                                  authMechanism="MONGODB-AWS")