uri = "<Atlas connection string>"
client = AsyncMongoClient(uri, server_api=pymongo.server_api.ServerApi(
   version="1", strict=True, deprecation_errors=True))