// Add your MongoCollection setup code here

// Creates a set of points that defines the bounds of a geospatial shape
Polygon longIslandTriangle = new Polygon(Arrays.asList(new Position(-72, 40),
        new Position(-74, 41),
        new Position(-72, 39),
        new Position(-72, 40)));

// Creates a projection to include only the "location.address.city" field in the results
Bson projection = fields(include("location.address.city"), excludeId());

// Creates a query that matches documents containing "location.geo" values within the specified bounds
Bson geoWithinComparison = geoWithin("location.geo", longIslandTriangle);

// Prints the projected field of the results from the geolocation query as JSON
collection.find(geoWithinComparison)
        .projection(projection)
        .forEach(doc -> System.out.println(doc.toJson()));