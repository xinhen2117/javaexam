import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    /**
     * 商品列表
     */
    public static Map<Long,Product> productMap = new HashMap<>();

    private Long productId;
    private String name;
    private int price;

    /**
     * 库存量
     */
    private int stockQuantity;

    /**
     * 判断商品是否可购买
     */
    public boolean isAvailable(Product product){
        int stockQuantity = product.getStockQuantity();
        if(stockQuantity <= 0){
            return false;
        }
        return true;
    }

    /**
     * 购买商品，扣减库存
     */
    public boolean reduceStock(Long productId,int quantity){
        Product product = productMap.get(productId);
        int leaveStock = product.getStockQuantity() - quantity;
        if(leaveStock < 0){
            return false;
        }else{
            product.setStockQuantity(leaveStock);
            productMap.put(productId,product);
            return true;
        }
    }

}
