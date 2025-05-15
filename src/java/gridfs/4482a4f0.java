Path filePath = Paths.get("/path/to/project.zip");
byte[] data = Files.readAllBytes(filePath);

// Defines options that specify configuration information for files uploaded to the bucket
GridFSUploadOptions options = new GridFSUploadOptions()
        .chunkSizeBytes(1048576)
        .metadata(new Document("type", "zip archive"));

try (GridFSUploadStream uploadStream = gridFSBucket.openUploadStream("myProject.zip", options)) {
    // Writes file data to the GridFS upload stream
    uploadStream.write(data);
    uploadStream.flush();

    // Prints the "_id" value of the uploaded file
    System.out.println("The file id of the uploaded file is: " + uploadStream.getObjectId().toHexString());

// Prints a message if any exceptions occur during the upload process
} catch (Exception e) {
    System.err.println("The file upload failed: " + e);
}