String filePath = "/path/to/project.zip";
try (InputStream streamToUploadFrom = new FileInputStream(filePath) ) {
    // Defines options that specify configuration information for files uploaded to the bucket
    GridFSUploadOptions options = new GridFSUploadOptions()
            .chunkSizeBytes(1048576)
            .metadata(new Document("type", "zip archive"));

    // Uploads a file from an input stream to the GridFS bucket
    ObjectId fileId = gridFSBucket.uploadFromStream("myProject.zip", streamToUploadFrom, options);

    // Prints the "_id" value of the uploaded file
    System.out.println("The file id of the uploaded file is: " + fileId.toHexString());
}