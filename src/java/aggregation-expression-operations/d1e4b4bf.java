var temperature = current().getInteger("temperature");

asList(project(fields(
    computed("extremeTemp", temperature
        .lt(of(10))
        .or(temperature.gt(of(95))))
)));