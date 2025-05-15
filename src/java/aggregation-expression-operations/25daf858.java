[ { $project: {
    totalInventory: {
        $sum: {
          $getField: { $objectToArray: "$warehouses" },
        } }
} } ]