[ { $project: {
    username: {
        $toLower: { $concat: ["$lastName", "$employeeID"] } }
} } ]