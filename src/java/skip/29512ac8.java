import com.mongodb.client.model.Aggregates;

collection.aggregate(Arrays.asList(Aggregates.match(), Aggregates.skip(2)));