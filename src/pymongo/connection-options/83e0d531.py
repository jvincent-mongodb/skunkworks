uri = "mongodb://<hostname>:<port>"
client = pymongo.AsyncMongoClient(uri, connectTimeoutMS=60000, tls=True)