GridFSDownloadOptions downloadOptions = new GridFSDownloadOptions().revision(0);

// Downloads a file to an output stream
try (FileOutputStream streamToDownloadTo = new FileOutputStream("/tmp/myProject.zip")) {
    gridFSBucket.downloadToStream("myProject.zip", streamToDownloadTo, downloadOptions);
    streamToDownloadTo.flush();
}