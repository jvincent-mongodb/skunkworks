uri = ("mongodb://<db_username>:<db_password>@<hostname>:<port>/?"
       "tls=true"
       "&tlsAllowInvalidCertificates=true")
client = pymongo.MongoClient(uri)