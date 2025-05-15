[ { $project: {
    extremeTemp: { $or: [ { $lt: ["$temperature", 10] },
                          { $gt: ["$temperature", 95] } ] }
} } ]