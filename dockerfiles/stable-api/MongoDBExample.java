ServerApi serverApi = ServerApi.builder()
        .version(ServerApiVersion.V1)
        .build();

// Replace the uri string with your MongoDB deployment's connection string
String uri = "<connection string uri>";

MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(new ConnectionString(uri))
        .serverApi(serverApi)
        .build();

MongoClient client = MongoClients.create(settings);