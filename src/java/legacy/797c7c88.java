MongoClientURI mongoURI = new MongoClientURI(URI,
        MongoClientOptions.builder()
                .writeConcern(WriteConcern.W1));
MongoClient client = new MongoClient(mongoURI);