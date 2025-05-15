GridFSUploadOptions options = new GridFSUploadOptions()
        .chunkSizeBytes(1048576) // 1MB chunk size
        .metadata(new Document("myField", "myValue"));