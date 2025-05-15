// Builder class imports
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;

// ...

collection.updateOne(eq("name", "fizz"), set("name", "buzz"));