import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class MongoDBExample {
    public static void main(String[] args) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoCollection<Document> collection = mongoClient.getDatabase("testdb").getCollection("testcollection");
            collection.find(eq("qty", 5)).forEach(doc -> System.out.println(doc.toJson()));
        }
    }
}