[ { $project: {
    availableShowtimes: {
        $filter: {
            input: "$showtimes",
            as: "showtime",
            cond: { $lt: [ "$$showtime.ticketsBought", { $sum: "$$showtime.seats" } ] }
    } }
} } ]