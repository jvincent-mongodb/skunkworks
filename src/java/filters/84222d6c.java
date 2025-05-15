Polygon square = new Polygon(Arrays.asList(new Position(0, 0), 
                                    new Position(4, 0), 
                                    new Position(4, 4), 
                                    new Position(0, 4),
                                    new Position(0, 0)));

// Prints documents that contain "coordinates" values that are within the bounds of the polygon passed as the filter parameter
Bson geoWithinComparison = geoWithin("coordinates", square);
collection.find(geoWithinComparison).forEach(doc -> System.out.println(doc.toJson()));