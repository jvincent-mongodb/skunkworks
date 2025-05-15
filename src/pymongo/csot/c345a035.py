uri = "mongodb://<db_username>:<db_password>@<hostname@:<port>/?timeoutMS=10000"
client = pymongo.MongoClient(uri)

coll = client["test-db"]["test-collection"]
coll.insert_one({"name": "Yngwie"})  # Uses a 10-second timeout.
coll.find_one({"name": "Yngwie"})  # Also uses a 10-second timeout.