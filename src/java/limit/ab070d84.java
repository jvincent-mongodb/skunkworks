MongoCursor<Document> cursor = collection.find()
    .sort(descending("length"))
    .limit(3)
    .skip(3)
    .iterator();