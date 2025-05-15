[ { $match: {
    $expr: {
        $eq: [ {
            $dayOfWeek: {
                date: { $dateFromString: { dateString: "$deliveryDate" } },
                timezone: "America/New_York" }},
            2
        ] }
} } ]