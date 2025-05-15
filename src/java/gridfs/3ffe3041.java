Bson query = Filters.eq("metadata.type", "zip archive");
Bson sort = Sorts.ascending("filename");

// Retrieves 5 documents in the bucket that match the filter and prints metadata
gridFSBucket.find(query)
        .sort(sort)
        .limit(5)
        .forEach(new Consumer<GridFSFile>() {
            @Override
            public void accept(final GridFSFile gridFSFile) {
                System.out.println(gridFSFile);
            }
        });