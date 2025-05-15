Bson filter = Filters.empty();
collection.find(filter)             
    .sort(Sorts.descending("qty"))        
    .skip(9)                       
    .forEach(doc -> System.out.println(doc.toJson()));