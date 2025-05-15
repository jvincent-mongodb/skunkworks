ServerAddress seed1 = new ServerAddress("host1", 27017);
ServerAddress seed2 = new ServerAddress("host2", 27017);
ServerAddress seed3 = new ServerAddress("host3", 27017);
MongoClientSettings settings = MongoClientSettings.builder()
        .applyToClusterSettings(builder ->
               builder.hosts(Arrays.asList(seed1, seed2, seed3)))
        .build();
MongoClient mongoClient = MongoClients.create(settings);