// Stores the coordinates of the NY MongoDB headquarters
Point refPoint = new Point(new Position(-73.98456, 40.7612));

// Retrieves documents that represent locations up to 1000 meters from the specified point directly from the geospatial index
// Creates a filter to match a document 
Bson filter = near("location.geo", refPoint, 1000.0, 0.0);
FindIterable<Document> cursor = collection.find(filter);