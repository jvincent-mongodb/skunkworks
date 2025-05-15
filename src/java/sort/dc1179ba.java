import static com.mongodb.client.model.Sorts.descending;

// <MongoCollection setup code here>

collection.find().sort(descending("_id"));