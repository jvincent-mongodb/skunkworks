client = pymongo.MongoClient("mongodb://<db_username>:<db_password>@<hostname>:<port>",
                             tls=True,
                             tlsCertificateKeyFile='/path/to/client.pem')