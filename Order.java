import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Order {
    private String orderId;
    private Customer customer;
    private Date orderDate;
    private List<Item> items;
    private int totalAmount;


    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customer=" + customer +
                ", orderDate=" + orderDate +
                ", items=" + items +
                ", totalAmount=" + totalAmount +
                '}';
    }
}