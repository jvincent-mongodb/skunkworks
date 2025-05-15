client = AsyncMongoClient("<connection string>")
db = client["db"]
bucket = gridfs.AsyncGridFSBucket(db)