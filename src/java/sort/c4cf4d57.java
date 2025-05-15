import static com.mongodb.client.model.Sorts.orderBy;
import static com.mongodb.client.model.Sorts.ascending;
import static com.mongodb.client.model.Sorts.descending;

// <MongoCollection setup code here>

Bson orderBySort = orderBy(descending("date"), ascending("orderTotal"));
collection.find().sort(orderBySort);