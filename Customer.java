import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.*;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends User{

    private Long userId;
    private String name;
    private String email;
    private  String password;

    public static List<Customer> customerList = new ArrayList<>();

    static ShoppingCart shoppingCart = new ShoppingCart();

    public Customer(long userId, String name, String email, String password) {
    }


    /**
     * 加入购物车
     * @param scanner
     */
    public void addToCart(Scanner scanner){
        shoppingCart.addItem(scanner);
    }

    /**
     * 从购物车中删除该商品
     * @param product
     */
    public void removeFromCart(Product product){
        shoppingCart.removeItem(product);
    }

    /**
     * 下单
     */
    public void placeOrder(){
        Order order = new Order();
        order.setOrderId(UUID.randomUUID().toString());
        order.setCustomer(customerList.get(0));
        order.setOrderDate(new Date());
        order.setItems(shoppingCart.items);
        order.setTotalAmount(shoppingCart.calculateTotal());
        System.out.println("--->>>order information as follow："+order.toString());
    }
}
