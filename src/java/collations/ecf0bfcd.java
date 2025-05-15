List<Document> results = new ArrayList<>();

// Retrieves all documents and applies a "de@collation-phonebook" collation and ascending sort to the results
collection.find()
        .collation(Collation.builder().locale("de@collation=phonebook").build())
        .sort(Sorts.ascending("first_name")).into(results);

// Prints the JSON representation of the results          
if (results != null) {
    results.forEach(doc -> System.out.println(doc.toJson()));
}