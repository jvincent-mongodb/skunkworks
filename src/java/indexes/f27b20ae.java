final String uri = "mongodb+srv://<atlas-uri>/<dbname>?retryWrites=true&w=majority";

mongoClient = MongoClients.create(uri);
database = mongoClient.getDatabase("sample_mflix");
collection = database.getCollection("movies");