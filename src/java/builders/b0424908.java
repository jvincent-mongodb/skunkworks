import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;
...

Bson filter = and(eq("gender", "female"), gt("age", 29));
Bson projection = fields(excludeId(), include("email"));
collection.find(filter).projection(projection);