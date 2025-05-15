CodecRegistry newRegistry = CodecRegistries.fromRegistries(
    CodecRegistries.fromCodecs(new MyEnumCodec()),
    MongoClientSettings.getDefaultCodecRegistry());