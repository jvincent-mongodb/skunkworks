import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.BsonInt64;
import java.util.Arrays;
import java.util.List;

public class MongoDBExample {
    public static void main(String[] args) {
        // Replace the connection string with your MongoDB deployment's connection string
        String uri = "mongodb://localhost:27017";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("test");

            Document commandResult = database.runCommand(new Document("listCollections", new BsonInt64(1)));

            List<String> keys = Arrays.asList("cursor");

            // Prints information about the database's collections and views
            System.out.println("listCollections: " + commandResult.getEmbedded(keys, Document.class).toJson());
        }
    }
}