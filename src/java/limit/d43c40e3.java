import com.mongodb.client.*;
import org.bson.Document;
import static com.mongodb.client.model.Sorts.descending;

// ...

// define a cursor that will return the first 3 sorted items
MongoCursor<Document> cursor = collection.find()
    .sort(descending("length"))
    .limit(3)
    .iterator();
// print out items
try {
    while (cursor.hasNext()) {
        System.out.println(cursor.next());
    }
}
// close the cursor
finally {
    cursor.close();
}