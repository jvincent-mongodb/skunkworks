var graduationYear = current().getString("graduationYear");

asList(addFields(
    new Field("reunionYear",
        graduationYear
            .parseInteger()
            .add(5))
));