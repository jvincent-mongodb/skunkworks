client = pymongo.MongoClient("mongodb://<db_username>:<db_password>@<hostname:<port>",
                             timeoutMS=10000)