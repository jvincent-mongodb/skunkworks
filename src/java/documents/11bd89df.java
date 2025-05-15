BsonDocument author = new BsonDocument()
    .append("_id", new BsonObjectId())
    .append("name", new BsonString("Gabriel García Márquez"))
    .append("dateOfDeath",
            new BsonDateTime(LocalDate.of(2014, 4, 17).atStartOfDay(ZoneId.systemDefault())
                                                      .toInstant().toEpochMilli()))
    .append("novels", new BsonArray(Arrays.asList(
        new BsonDocument().append("title", new BsonString("One Hundred Years of Solitude"))
                          .append("yearPublished", new BsonInt32(1967)),
        new BsonDocument().append("title", new BsonString("Chronicle of a Death Foretold"))
                          .append("yearPublished", new BsonInt32(1981)),
        new BsonDocument().append("title", new BsonString("Love in the Time of Cholera"))
                          .append("yearPublished", new BsonInt32(1985))
   )));