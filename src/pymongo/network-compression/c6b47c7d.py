client = pymongo.MongoClient("mongodb://<db_username>:<db_password>@<hostname>:<port>",
                             compressors = "snappy,zstd,zlib")