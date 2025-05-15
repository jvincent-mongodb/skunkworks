[ { $project: {
    numericalRating: {
        $cond: { if: { $isNumber: "$rating" },
                 then: "$rating",
                 else: 1
        } }
} } ]