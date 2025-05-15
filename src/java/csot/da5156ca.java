GridFSBucket gridFSBucket = GridFSBuckets
        .create(database)
        .withTimeout(200L, MILLISECONDS);