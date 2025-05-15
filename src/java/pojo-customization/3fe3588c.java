CodecRegistry registry = CodecRegistries.fromRegistries(
        CodecRegistries.fromCodecs(
                new MyDateAsStringCodec()),
        MongoClientSettings.getDefaultCodecRegistry(),
        fromProviders(pojoCodecProvider));