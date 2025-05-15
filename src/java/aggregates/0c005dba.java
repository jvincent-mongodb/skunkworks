fill(
        FillOptions.fillOptions().sortBy(ascending("hour")),
        FillOutputField.value("temperature", "23.6C"),
        FillOutputField.linear("air_pressure")
        );