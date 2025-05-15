group(
        "$year", 
        topN(
                "longest_three_movies",
                descending("runtime"),
                asList(new BsonString("$title"), new BsonString("$runtime")),
                3
                ));