[
    { $match: {
        $expr: {
            $eq: [{
                $getField: {
                    input: { $getField: { input: "$$CURRENT", field: "mailing.address"}},
                    field: "state" }},
                "WA" ]
}}}]