[ { $project: {
    membershipLevel: {
        $switch: {
          branches: [
            { case: { $eq: [ { $type: "$member" }, "string" ] }, then: "$member" },
            { case: { $eq: [ { $type: "$member" }, "bool" ] }, then: { $cond: {
                                                                           if: "$member",
                                                                           then: "Gold",
                                                                           else: "Guest" } } },
            { case: { $eq: [ { $type: "$member" }, "array" ] }, then: { $last: "$member" } }
          ],
          default: "Guest" } }
} } ]