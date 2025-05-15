// <MongoCollection set up code here>
Bson sort = Sorts.descending("_id");

// Creates an empty filter to match all documents in the collection
Bson filter = Filters.empty();

// Defines options that specify a descending sort on the "_id" field
FindOneAndDeleteOptions options = new FindOneAndDeleteOptions().
        sort(sort);

// Deletes the document containing the highest "_id" value and prints the deleted document
Document result = collection.findOneAndDelete(filter, options);
System.out.println(result.toJson());