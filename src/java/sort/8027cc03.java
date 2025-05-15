import static com.mongodb.client.model.Sorts.ascending;

// <MongoCollection setup code here>

collection.find().sort(ascending("<field name>"));