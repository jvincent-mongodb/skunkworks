group(
        "$year", 
        bottom(
                "shortest_movies",
                descending("runtime"),
                asList(new BsonString("$title"), new BsonString("$runtime"))
                ));