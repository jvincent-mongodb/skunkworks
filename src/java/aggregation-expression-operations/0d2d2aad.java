var month = current().getDate("date").month(of("UTC"));
var precip = current().getInteger("precipitation");

asList(group(
    month,
    avg("avgPrecipMM", precip.multiply(25.4))
));