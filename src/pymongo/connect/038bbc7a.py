client = pymongo.AsyncMongoClient("mongodb://<db_username>:<db_password>@<hostname>:<port>",
   compressors = "zlib",
   zlibCompressionLevel=<zlib compression level>)