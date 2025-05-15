ConnectionString connectionString = new ConnectionString(
        "mongodb+srv://<db_username>:<db_password>@<cluster-url>/?compressors=snappy,zlib,zstd");

MongoClient client = MongoClients.create(connectionString);