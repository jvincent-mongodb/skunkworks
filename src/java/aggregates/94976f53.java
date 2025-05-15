bucketAuto("$price", 10, new BucketAutoOptions().granularity(BucketGranularity.POWERSOF2)
        .output(sum("count", 1), avg("avgPrice", "$price")));