group(
        "$year",
        firstN(
                "first_four_movies",
                new BsonString("$title"),
                4
                ));