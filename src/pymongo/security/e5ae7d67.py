client = pymongo.MongoClient("mongodb://<hostname>:<port>",
                             username="<db_username>",
                             password="<db_password>",
                             authMechanism="PLAIN",
                             tls=True)