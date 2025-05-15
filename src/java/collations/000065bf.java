Document result = collection.findOneAndDelete(
        Filters.gt("a", "100"),
        new FindOneAndDeleteOptions()
                .collation(
                        Collation.builder()
                                .locale("en")
                                .numericOrdering(true)
                                .build())
                .sort(Sorts.ascending("a")));

// Prints the JSON representation of the deleted document  
if (result != null) {
    System.out.println("Deleted document: " + result.toJson());
}