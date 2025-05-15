uri = ("mongodb://<db_username>:<db_password>@<hostname>:<port>/?"
       "tls=true"
       "&tlsAllowInvalidHostnames=true")
client = pymongo.AsyncMongoClient(uri)