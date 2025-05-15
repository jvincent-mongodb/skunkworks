graphLookup("contacts", "$friends", "friends", "name", "socialNetwork",
        new GraphLookupOptions().maxDepth(1).restrictSearchWithMatch(eq("hobbies", "golf")));