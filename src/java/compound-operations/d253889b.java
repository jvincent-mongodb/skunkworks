// <MongoCollection set up code here>

// Creates a projection to exclude the "_id" field from the retrieved documents
Bson projection = Projections.excludeId();

// Creates a filter to match documents with a "color" value of "green"
Bson filter = Filters.eq("color", "green");

// Creates an update document to set the value of "food" to "pizza"
Bson update = Updates.set("food", "pizza");

// Defines options that specify projected fields, permit an upsert and limit execution time
FindOneAndUpdateOptions options = new FindOneAndUpdateOptions().
        projection(projection).
        upsert(true).
        maxTime(5, TimeUnit.SECONDS);

// Updates the first matching document with the content of the update document, applying the specified options
Document result = collection.findOneAndUpdate(filter, update, options);

// Prints the matched document in its state before the operation
System.out.println(result.toJson());