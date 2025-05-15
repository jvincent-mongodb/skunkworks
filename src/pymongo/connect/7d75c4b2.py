from pymongo.server_api import ServerApi

client = pymongo.MongoClient("mongodb://<db_username>:<db_password>@<hostname:<port>",
                             server_api=ServerApi("<Stable API version>"))