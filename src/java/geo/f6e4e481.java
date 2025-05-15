// Add your MongoClient setup code here
MongoDatabase database = mongoClient.getDatabase("sample_mflix");
MongoCollection<Document> collection = database.getCollection("theaters");

Point centralPark = new Point(new Position(-73.9667, 40.78));

// Creates a query that matches all locations between 5,000 and 10,000 meters from the specified Point
Bson query = near("location.geo", centralPark, 10000.0, 5000.0);

// Creates a projection to include only the "location.address.city" field in the results
Bson projection = fields(include("location.address.city"), excludeId());

// Prints the projected field of the results from the geospatial query as JSON
collection.find(query)
        .projection(projection)
        .forEach(doc -> System.out.println(doc.toJson()));