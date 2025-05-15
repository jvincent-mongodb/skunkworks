current()
    .getArray("visitDates")
    .size()
    .gt(of(0))
    .and(current()
        .getString("state")
        .eq(of("New Mexico")));