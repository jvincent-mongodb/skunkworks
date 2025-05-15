import com.mongodb.client.model.Aggregates;
import static com.mongodb.client.model.Sorts.ascending;

// <MongoCollection setup code here>

collection.aggregate(Arrays.asList(Aggregates.sort(ascending("_id"))));