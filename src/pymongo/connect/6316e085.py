client = pymongo.MongoClient("mongodb://<db_username>:<db_password>@<hostname>:<port>",
                             server_selector=<selector function>)