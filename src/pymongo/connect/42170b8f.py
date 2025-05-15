from pymongo.server_api import ServerApi

client = pymongo.AsyncMongoClient("mongodb://<db_username>:<db_password>@<hostname:<port>",
   server_api=ServerApi("<Stable API version>"))