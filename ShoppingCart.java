import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Data
public class ShoppingCart {

    static List<Item> items = new ArrayList<>();

    public void addItem(Scanner sc){
        Item item = new Item();

        items.add(item);


        System.out.println("please enter productid you want to buy");
        int id = sc.nextInt();//键盘接受编号

        Product product = Product.productMap.get(Long.parseLong(id+""));

        System.out.println("please enter buy quantity");
        int buyNumber = sc.nextInt();//键盘接收数量

        item.setProduct(product);
        item.setQuantity(buyNumber);
//
//       // 2. 把这个购买信息封装成一个商品对象
//       Goods g = new Goods();
//        //第一  si对象里面的成员变量（属性）第二个是用户输入的信息
//        g.id = id;
//        g.name = name;
//        g.price = price;
//        g.buynumber = buynumber;
//        //3. 把这个商品对象添加到购物车中去
//        for (int i = 0; i < shopCar.length; i++) {
//            if (shopCar[i] == null) {
//                //说明此位置没有元素存入，把我们的商品添加到此处
//                shopCar[i] = g;
//                break;//商品已存入
//            }
//        }
        System.out.println("your product：【" + product.getName() + "】add to shopping cart successfully!");

    }
    public void removeItem(Product product){
        items.remove(product);
    }

    public void printProduct(){
        System.out.println("-----------------检查购物车信息如下-------------------");
        System.out.println("ID\t\tName\t\t\tPrice\t\t\tQuantity");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i); // 使用索引 i 获取当前循环中的项目
            // 展示这个商品对象
            System.out.println(
                    item.getProduct().getProductId() + "\t\t" +
                            item.getProduct().getName() + "\t\t\t" +
                            item.getProduct().getPrice() + "\t\t\t" +
                            item.getQuantity()
            );
        }
    }

    /**
     * 计算购物车总价
     * @return
     */
    public int calculateTotal(){
        final int[] total = {0};
        items.stream().forEach(obj->{
            Product product = obj.getProduct();
            int cartPrice = product.getPrice() * obj.getQuantity();
            total[0] += cartPrice;
        });
        System.out.println("--->>>the total price you will pay" + total[0]);
        return total[0];
    }
}
