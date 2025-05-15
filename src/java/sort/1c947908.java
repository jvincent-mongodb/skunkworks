import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Indexes;

// <MongoCollection setup code here>

collection.createIndex(Indexes.text("food"));
Bson metaTextScoreSort = Sorts.metaTextScore("score");
Bson metaTextScoreProj = Projections.metaTextScore("score");
String searchTerm = "maple donut";
Bson searchQuery = Filters.text(searchTerm);
collection.find(searchQuery)
         .projection(metaTextScoreProj)
         .sort(metaTextScoreSort)
         .into(results);
for (Document result : results) {
      System.out.println(result.toJson());
}