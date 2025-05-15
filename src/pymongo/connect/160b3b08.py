uri = "mongodb://<db_username>:<db_password>@<hostname:<port>/?timeoutMS=<timeout length>"
client = pymongo.AsyncMongoClient(uri)