Window pastMonth = Windows.timeRange(-1, MongoTimeUnit.MONTH, Windows.Bound.CURRENT);
setWindowFields("$localityId", Sorts.ascending("measurementDateTime"),
        WindowOutputFields.sum("monthlyRainfall", "$rainfall", pastMonth),
        WindowOutputFields.avg("monthlyAvgTemp", "$temperature", pastMonth));