// Add your MongoCollection setup code here
Point point = new Point(new Position(-74.0065, 40.7085));

Document theater = new Document("theaterId", 1203)
		.append("location", new Document("geo", point));

InsertOneResult result = collection.insertOne(theater);