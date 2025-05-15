bucket("$screenSize", asList(0, 24, 32, 50, 70),
        new BucketOptions().defaultBucket("monster").output(sum("count", 1), push("matches", "$screenSize")));