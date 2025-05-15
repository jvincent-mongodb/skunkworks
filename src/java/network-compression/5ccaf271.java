MongoClientSettings settings = MongoClientSettings.builder()
        .compressorList(Arrays.asList(MongoCompressor.createSnappyCompressor(),
                        MongoCompressor.createZlibCompressor(),
                        MongoCompressor.createZstdCompressor()))
        .build();

MongoClient client = MongoClients.create(settings);