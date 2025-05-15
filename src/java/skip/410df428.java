import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Aggregates;

// Add your MongoCollection setup code here

Bson filter = Filters.empty();
collection.aggregate(Arrays.asList(
    Aggregates.match(filter), 
    Aggregates.sort(Sorts.descending("qty")), 
    Aggregates.skip(5)))
    .forEach(doc -> System.out.println(doc.toJson()));