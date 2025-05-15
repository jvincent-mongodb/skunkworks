uri = "mongodb://<hostname>:<port>"
client = pymongo.MongoClient(uri, connectTimeoutMS=60000, tls=True)