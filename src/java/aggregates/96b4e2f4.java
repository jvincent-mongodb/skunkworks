group(
        "$year",
        maxN(
                "highest_two_ratings",
                new BsonString("$imdb.rating"),
                2
                ));