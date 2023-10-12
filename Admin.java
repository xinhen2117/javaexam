import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends User{
//    super(userId,name,email,password);
    private Long userId;
    private String name;
    private String email;
    private String password;

    /**
     * 添加商品
     * @param product
     */
    public void addProduct(Product product){
        Product.productMap.put(product.getProductId(),product);
    }

    public void removeProduct(Product product){
        Product.productMap.remove(product);
    }

    public void updateProductStock(Product product, int newStock){
        Product oldProduct = Product.productMap.get(product.getProductId());
        oldProduct.setStockQuantity(newStock);
        Product.productMap.put(product.getProductId(),oldProduct);
    }

    public void removeCustomer(Customer customer){
        Customer.customerList.remove(customer);
    }
}
