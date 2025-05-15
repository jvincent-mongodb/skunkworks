uri = ("mongodb://<db_username>:<db_password>@<hostname>:<port>/?"
       "tls=true"
       "&tlsInsecure=true")
client = pymongo.AsyncMongoClient(uri)