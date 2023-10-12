import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ElectronicProduct extends Product{
    private Long productId;
    private String name;
    private int price;
    private int stockQuantity;
    private  String warrantyPeriod;
    private String voltage;
    ElectronicProduct Ep1 = new ElectronicProduct(50001,"phone",3000,5,"2025.10","5v");
    ElectronicProduct Ep2 = new ElectronicProduct(50002,"laptop",5000,10,"2025.12","240v");
    public ElectronicProduct(int productId, String name, int price, int stockQuantity, String warrantyPeriod, String voltage) {
    }


    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", warrantyPeriod='" + warrantyPeriod + '\'' +
                ", voltage='" + voltage + '\'' +
                '}';
    }
}