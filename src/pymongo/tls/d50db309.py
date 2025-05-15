uri = ("mongodb://<db_username>:<db_password>@<hostname:<port>/?"
       "tls=true"
       "&tlsCertificateKeyFile=path/to/client.pem")
client = pymongo.MongoClient(uri)