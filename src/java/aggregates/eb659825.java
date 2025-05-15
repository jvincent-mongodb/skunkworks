graphLookup("contacts", "$friends", "friends", "name", "socialNetwork",
        new GraphLookupOptions().maxDepth(2).depthField("degrees"));