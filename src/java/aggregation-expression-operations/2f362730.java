var address = current().getDocument("mailing.address");

asList(match(expr(address
    .getString("state")
    .eq(of("WA"))
)));