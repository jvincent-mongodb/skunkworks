uri = "<Atlas connection string>"
client = MongoClient(uri, server_api=pymongo.server_api.ServerApi(
   version="1", strict=True, deprecation_errors=True))