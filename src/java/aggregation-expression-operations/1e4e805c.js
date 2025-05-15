[ { $project: {
    evaluation: { $switch: {
        branches: [
            { case: { $lte: [ { $avg: "$students.finalGrade" }, 70 ] },
              then: "Needs improvement"
            },
            { case: { $lte: [ { $avg: "$students.finalGrade" }, 85 ] },
              then: "Meets expectations"
            }
        ],
        default: "Exceeds expectations" } }
} } ]