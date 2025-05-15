Document result = collection.findOneAndUpdate(
        Filters.gt("first_name", "Gunter"),
        Updates.set("verified", true),
        new FindOneAndUpdateOptions()
                .collation(Collation.builder().locale("de@collation=phonebook").build())
                .sort(Sorts.ascending("first_name"))
                .returnDocument(ReturnDocument.AFTER));

// Prints the JSON representation of the updated document if an update occurred           
if (result != null) {
    System.out.println("Updated document: " + result.toJson());
}