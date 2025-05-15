ObjectId fileId = new ObjectId("60345d38ebfcf47030e81cc9");

// Deletes the file that has a specified "_id" value from the GridFS bucket
gridFSBucket.delete(fileId);