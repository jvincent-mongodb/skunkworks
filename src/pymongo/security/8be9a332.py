uri = ("mongodb://<db_username>:<db_password"
       "@<hostname>:<port>/?"
       "tls=true"
       "&tlsCertificateKeyFile=path/to/client.pem"
       "&tlsCertificateKeyFilePassword=<passphrase>")
client = pymongo.AsyncMongoClient(uri)