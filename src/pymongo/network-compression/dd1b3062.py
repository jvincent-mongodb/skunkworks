client = pymongo.MongoClient("mongodb://<db_username>:<db_password>@<hostname>:<port>",
                             compressors = "zlib",
                             zlibCompressionLevel=1)