import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoCommandException;
import com.mongodb.client.*;
import com.mongodb.client.model.IndexOptions;
import com.mongodb.client.model.Indexes;
import com.mongodb.client.model.Sorts;
import com.mongodb.client.model.geojson.Point;
import com.mongodb.client.model.geojson.Position;
import org.apache.log4j.BasicConfigurator;
import org.bson.Document;
import org.bson.conversions.Bson;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Projections.*;