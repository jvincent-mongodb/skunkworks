uri = "mongodb://<db_username>:<db_password>@<hostname>:<port>/?tls=true&tlsCAFile=/path/to/ca.pem"
client = pymongo.MongoClient(uri)