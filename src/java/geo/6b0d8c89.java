// Add your MongoCollection setup code here
Document theater = new Document("theaterId", 1204)
		.append("coordinates", Arrays.asList(-73.9862, 40.7311));

InsertOneResult result = collection.insertOne(theater);