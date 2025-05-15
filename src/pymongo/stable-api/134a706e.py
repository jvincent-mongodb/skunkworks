from pymongo import MongoClient
from pymongo.server_api import ServerApi

client = MongoClient("mongodb://<db_username>:<db_password>@<hostname:<port>",
                     server_api=ServerApi("1"))