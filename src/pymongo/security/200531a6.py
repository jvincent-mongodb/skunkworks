client = pymongo.MongoClient("mongodb://<hostname>:<port>",
                             username="<db_username>",
                             password="<db_password>",
                             authSource="<authentication database>",
                             authMechanism="SCRAM-SHA-256")