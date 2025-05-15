import com.mongodb.connection.TransportSettings;

// ...

MongoClientSettings settings = MongoClientSettings.builder()
        .transportSettings(TransportSettings.nettyBuilder().build())
        .build();