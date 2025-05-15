from pymongo import AsyncMongoClient
from pymongo.server_api import ServerApi

client = AsyncMongoClient("mongodb://<db_username>:<db_password>@<hostname:<port>",
                          server_api=ServerApi("1"))