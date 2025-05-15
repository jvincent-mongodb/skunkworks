facet(new Facet("Screen Sizes",
        bucketAuto("$attributes.screen_size", 5, new BucketAutoOptions().output(sum("count", 1)))),
        new Facet("Manufacturer", sortByCount("$attributes.manufacturer"), limit(5)));