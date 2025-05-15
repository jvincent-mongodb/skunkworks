var deliveryDate = current().getString("deliveryDate");

asList(match(expr(deliveryDate
    .parseDate()
    .dayOfWeek(of("America/New_York"))
    .eq(of(2))
)));