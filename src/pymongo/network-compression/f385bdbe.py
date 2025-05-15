uri = ("mongodb://<db_username>:<db_password>@<hostname>:<port>/?"
       "compressors=zlib"
       "zlibCompressionLevel=1")
client = pymongo.AsyncMongoClient(uri)