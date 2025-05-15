group(
        "$year", 
        top(
                "top_rated_movie",
                descending("imdb.rating"),
                asList(new BsonString("$title"), new BsonString("$imdb.rating"))
                ));