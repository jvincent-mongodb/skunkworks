import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Sorts;

// Add your MongoCollection setup code here

Bson filter = Filters.empty();
collection.find(filter)             
    .sort(Sorts.descending("qty"))        
    .skip(5)                       
    .forEach(doc -> System.out.println(doc.toJson()));