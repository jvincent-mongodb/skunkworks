BulkWriteOptions options = new BulkWriteOptions().ordered(false);

// Runs a bulk write operation for the specified insert, replace, update, and delete WriteModels in any order
collection.bulkWrite(bulkOperations, options);