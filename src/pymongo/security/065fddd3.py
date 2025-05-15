client = pymongo.MongoClient("mongodb://<hostname>:<port>",
                             username="<username>",
                             password="<password>",
                             authMechanism="PLAIN",
                             tls=True)