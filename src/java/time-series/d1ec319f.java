MongoDatabase database = mongoClient.getDatabase("fall_weather");
TimeSeriesOptions tsOptions = new TimeSeriesOptions("temperature");
CreateCollectionOptions collOptions = new CreateCollectionOptions().timeSeriesOptions(tsOptions);

// Creates a time series collection that stores "temperature" values over time
database.createCollection("september2021", collOptions);