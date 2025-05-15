group(
        "$year",
        lastN(
                "last_three_movies",
                new BsonString("$title"),
                3
                ));