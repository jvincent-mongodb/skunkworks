[ { $addFields: {
    reunionYear: {
        $add: [ { $toInt: "$graduationYear" }, 5 ] }
} } ]