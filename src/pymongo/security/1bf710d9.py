client = pymongo.MongoClient("mongodb://<hostname>:<port>",
                             tls=True,
                             tlsCertificateKeyFile="/path/to/client.pem",
                             authMechanism="MONGODB-X509")