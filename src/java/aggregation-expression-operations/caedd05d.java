var rating = current().getField("rating");

asList(project(fields(
    computed("numericalRating", rating
        .isNumberOr(of(1)))
)));