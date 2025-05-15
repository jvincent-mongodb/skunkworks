uri = ("mongodb://<percent-encoded username>:<percent-encoded user password>"
       "@<hostname>:<port>/?"
       "&authMechanism=GSSAPI"
       "&authMechanismProperties="
         "SERVICE_NAME:<authentication service name>,"
         "CANONICALIZE_HOST_NAME:true,"
         "SERVICE_REALM:<service realm>")
client = pymongo.MongoClient(uri)