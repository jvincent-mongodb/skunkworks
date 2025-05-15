public class AggTour {

    public static void main(String[] args) {
        // Replace the uri string with your MongoDB deployment's connection string
        String uri = "<connection string>";

        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase("aggregation");
        MongoCollection<Document> collection = database.getCollection("restaurants");

        // Paste the aggregation code here
    }
}