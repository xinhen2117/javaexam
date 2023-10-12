import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode(callSuper = true)
@Getter
@Data
public class ClothingProduct extends Product{
    private Long productId;
    private String name;
    private int price;
    private int stockQuantity;
    private int size;
    private int mater;


    @Override
    public String toString() {
        return "ClothingProduct{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", size=" + size +
                ", mater=" + mater +
                '}';
    }
}
