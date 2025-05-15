client = pymongo.AsyncMongoClient("mongodb://<db_username>:<db_password>@<hostname>:<port>",
   server_selector=<selector function>)