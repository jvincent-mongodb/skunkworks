client = pymongo.AsyncMongoClient("mongodb://<db_username>:<db_password>@<hostname>:<port>",
                                  tls=True,
                                  tlsInsecure=True)