MongoCursor<Document> cursor = collection.find().cursor();

try {
    while (cursor.hasNext()){
        System.out.println(cursor.next().toJson());
    }
} finally {
    cursor.close();
}