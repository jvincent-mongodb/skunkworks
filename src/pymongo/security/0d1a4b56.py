client = pymongo.AsyncMongoClient("mongodb://<hostname>:<port>",
                                  username="<username>",
                                  authMechanism="GSSAPI",
                                  password="<password>",
                                  authMechanismProperties="SERVICE_NAME:<authentication service name>,
                                      CANONICALIZE_HOST_NAME:true,
                                      SERVICE_REALM:<service realm>")