client = MongoClient("<connection string>")
db = client["db"]
bucket = gridfs.GridFSBucket(db)