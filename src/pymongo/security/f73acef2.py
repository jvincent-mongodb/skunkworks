uri = ("mongodb://<percent-encoded username>:<percent-encoded password>"
       "@<hostname>:<port>/?"
       "authSource=<authentication database>"
       "&authMechanism=SCRAM-SHA-256")
client = pymongo.AsyncMongoClient(uri)