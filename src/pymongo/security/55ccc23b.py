uri = ("mongodb://<hostname>:<port>/?"
       "tls=true"
       "&tlsCertificateKeyFile=path/to/client.pem"
       "&authMechanism=MONGODB-X509")
client = pymongo.AsyncMongoClient(uri)