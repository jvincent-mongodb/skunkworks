String connectionString = "mongodb+srv://myDatabaseUser:myPassword@example.org/" +
        "?proxyHost=<proxyHost>" +
        "&proxyPort=<proxyPort>" +
        "&proxyUsername=<proxyUsername>" +
        "&proxyPassword=<proxyPassword>";

MongoClient mongoClient = MongoClients.create(connectionString);