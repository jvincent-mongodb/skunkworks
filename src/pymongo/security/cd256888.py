uri = ("mongodb://<percent-encoded username>:<percent-encoded password>"
       "@<hostname>:<port>/?"
       "authSource=<authentication database>"
       "&authMechanism=SCRAM-SHA-1")
client = pymongo.MongoClient(uri)