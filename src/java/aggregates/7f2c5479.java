group(
        "$year", 
        bottomN(
                "lowest_rated_two_movies",
                descending("imdb.rating"),
                asList(new BsonString("$title"), new BsonString("$imdb.rating")),
                2
                ));