import com.mongodb.connection.netty.NettyStreamFactoryFactory;

// ...

MongoClientSettings settings = MongoClientSettings.builder()
        .streamFactoryFactory(NettyStreamFactoryFactory.builder().build())
        .build();