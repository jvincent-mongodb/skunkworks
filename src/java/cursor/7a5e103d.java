MongoCursor<Document> cursor = collection.find().cursor();
System.out.println(cursor.available());