collection.insertMany(Arrays.asList(
    new Document().append("_id", 1)
        .append("title", "The Brothers Karamazov").append("length", 824)
        .append("author", "Dostoyevsky"),
    new Document().append("_id", 2)
        .append("title", "Les Misérables").append("length", 1462).append("author", "Hugo"),
    new Document().append("_id", 3)
        .append("title", "Atlas Shrugged").append("length", 1088).append("author", "Rand"),
    new Document().append("_id", 4)
        .append("title", "Infinite Jest").append("length", 1104).append("author", "Wallace"),
    new Document().append("_id", 5)
        .append("title", "Cryptonomicon").append("length", 918).append("author", "Stephenson"),
    new Document().append("_id", 6)
        .append("title", "A Dance with Dragons").append("length", 1104)
        .append("author", "Martin")
));