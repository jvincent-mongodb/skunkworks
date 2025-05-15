client = pymongo.AsyncMongoClient("mongodb://<hostname>:<port>",
                                  username="mongodbuser@EXAMPLE.COM",
                                  authMechanism="GSSAPI",
                                  password="<user password>",
                                  authMechanismProperties="SERVICE_NAME:<authentication service name>,
                                      CANONICALIZE_HOST_NAME:true,
                                      SERVICE_REALM:<service realm>")