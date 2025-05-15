client = pymongo.MongoClient("mongodb://<hostname>:<port>",
                             username="<db_username>",
                             authMechanism="GSSAPI",
                             password="<db_password>",
                             authMechanismProperties="SERVICE_NAME:<authentication service name>,
                                 CANONICALIZE_HOST_NAME:true,
                                 SERVICE_REALM:<service realm>")