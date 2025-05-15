client = pymongo.AsyncMongoClient("mongodb://<hostname>:<port>",
                                  username="<username>",
                                  password="<password>",
                                  authMechanism="PLAIN",
                                  tls=True)