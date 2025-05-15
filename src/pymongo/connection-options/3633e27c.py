uri = "mongodb://<hostname>:<port>/?connectTimeoutMS=60000&tls=true"
client = pymongo.AsyncMongoClient(uri)