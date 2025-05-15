client = pymongo.AsyncMongoClient("mongodb://<hostname>:<port>",
                                  username="mongodbuser@EXAMPLE.COM",
                                  authMechanism="GSSAPI",
                                  authMechanismProperties="SERVICE_NAME:<authentication service name>")