client = pymongo.MongoClient("mongodb://<db_username>:<db_password>@<hostname>:<port>",
                             tls=True,
                             tlsAllowInvalidCertificates=True)