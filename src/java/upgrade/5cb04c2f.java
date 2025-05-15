ClusterSettings.builder()
    .hosts(Collections.singletonList(
            new ServerAddress("127.0.0.1", 27017)
    ))
    .requiredReplicaSetName("replset")
    .build()
    .getMode()