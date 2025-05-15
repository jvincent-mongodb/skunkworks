ObjectId fileId = new ObjectId("60345d38ebfcf47030e81cc9");

// Opens an input stream to read a file containing a specified "_id" value and downloads the file
try (GridFSDownloadStream downloadStream = gridFSBucket.openDownloadStream(fileId)) {
    int fileLength = (int) downloadStream.getGridFSFile().getLength();
    byte[] bytesToWriteTo = new byte[fileLength];
    downloadStream.read(bytesToWriteTo);

    // Prints the downloaded file's contents as a string
    System.out.println(new String(bytesToWriteTo, StandardCharsets.UTF_8));
}