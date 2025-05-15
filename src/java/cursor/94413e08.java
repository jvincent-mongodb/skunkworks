try(MongoCursor<Document> cursor = collection.find().cursor()) {
    while (cursor.hasNext()){
        System.out.println(cursor.next().toJson());
    }
}