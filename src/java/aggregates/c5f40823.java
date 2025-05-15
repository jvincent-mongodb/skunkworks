merge(new MongoNamespace("reporting", "customers"),
        new MergeOptions().uniqueIdentifier(asList("date", "customerId"))
                .whenMatched(MergeOptions.WhenMatched.REPLACE)
                .whenNotMatched(MergeOptions.WhenNotMatched.INSERT));