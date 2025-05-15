uri = ("mongodb://<username>:<password>@<hostname>:<port>/?"
       "&authMechanism=PLAIN"
       "&tls=true")
client = pymongo.MongoClient(uri)