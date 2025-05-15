ObjectId fileId = new ObjectId("60345d38ebfcf47030e81cc9");

// Renames the file that has a specified "_id" value to "mongodbTutorial.zip"
gridFSBucket.rename(fileId, "mongodbTutorial.zip");