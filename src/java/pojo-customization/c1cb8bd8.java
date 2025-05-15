import org.bson.BsonType;
import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.codecs.pojo.annotations.BsonRepresentation;

@BsonDiscriminator(value="AnnotatedProduct", key="_cls")
public class Product {
    @BsonProperty("modelName")
    private String name;

    @BsonId()
    @BsonRepresentation(BsonType.OBJECT_ID)
    private String serialNumber;

    @BsonIgnore
    private List<Product> relatedItems;

    @BsonCreator
    public Product(@BsonProperty("modelName") String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ...
}