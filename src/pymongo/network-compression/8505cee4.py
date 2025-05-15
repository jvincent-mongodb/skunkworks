client = pymongo.AsyncMongoClient("mongodb://<db_username>:<db_password>@<hostname>:<port>",
                                  compressors = "snappy,zstd,zlib")