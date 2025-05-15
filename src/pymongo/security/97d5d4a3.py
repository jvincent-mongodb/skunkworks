uri = ("mongodb://mongodbuser%40EXAMPLE.COM@<hostname>:<port>/?"
       "&authMechanism=GSSAPI"
       "&authMechanismProperties=SERVICE_NAME:<authentication service name>")
client = pymongo.AsyncMongoClient(uri)