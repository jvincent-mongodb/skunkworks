client = pymongo.MongoClient("mongodb://<db_username>:<db_password>@<hostname>:<port>",
                             tls=True,
                             tlsCRLFile="/path/to/crl.pem")