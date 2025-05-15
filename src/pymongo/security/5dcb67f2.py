uri = ("mongodb://<db_username>:<db_password>@<hostname>:<port>/?"
       "&authMechanism=PLAIN"
       "&tls=true")
client = pymongo.MongoClient(uri)