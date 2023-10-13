import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //初始化商品信息
        Product p1 = new Product(1l,"toothbrushes",8,10);
        Product p2 = new Product(2l,"shampoos",6,20);
        Product p3 = new Product(3l,"slippers",4,18);
        Product p4 = new Product(4l,"shower gel",25,24);
        Admin admin = new Admin(10l,"admin1","2501577489@qq.com","202117");
        admin.addProduct(p1);
        admin.addProduct(p2);
        admin.addProduct(p3);
        admin.addProduct(p4);

        //初始化消费者
        Customer customer = new Customer(80l,"customer1","2501577489@qq.com","202117");
        Customer.customerList.add(customer);

        //初始化购物车
        ShoppingCart cart = new ShoppingCart();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>product list as follow<<<<<<<<<<<<<<<<<<<<");
        Map<Long, Product> productMap = Product.productMap;
        System.out.println("productId---name---price--stock");
        for (Long productId : productMap.keySet()) {
            Product product = productMap.get(productId);
            if (product != null) {
                //展示这个商品对象
                System.out.println(product.getProductId() + "---------" + product.getName() + "-----" + product.getPrice() + "----" + product.getStockQuantity());
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>product list as above<<<<<<<<<<<<<<<<<<<<");

        while (true) {
            System.out.println("Please select the following commands to operate:");
            System.out.println("add goods to shopping cart:add");
            System.out.println("check shopping cart items:check");
            System.out.println("Settle the amount of goods purchased:pay");
            System.out.println("quit the program:quit");
            Scanner sc = new Scanner(System.in);
            System.out.println("---->>>>please enter your command<<<<<-----:");
            String command = sc.next();
            switch (command) {
                case "add":
                    cart.addItem(sc);
                    break;
                case "check":
                    //查询购物车商品展示
                    cart.printProduct();
                    break;
                case "pay":
                    //结算金额
                    cart.calculateTotal();
                    break;
                case "quit":
                    return;
                default:
                    System.out.println("no such function!");
            }
        }
        /*//test addproduct
//        Admin admin = new Admin(10l,"admin1","2501577489@qq.com","202117");
        Scanner scanner = new Scanner(System.in);
//        addproduct
        System.out.println("please enter a string as object:");
        obj = scanner.next();
        System.out.println("please enter productid:");
        long productId = Long.parseLong(scanner.next());
        System.out.println("please enter name:");
        String name = scanner.next();
        System.out.println("please enter price:");
        int price = Integer.parseInt(scanner.next());
        System.out.println("please enter stock:");
        int stock = Integer.parseInt(scanner.next());
        Product obj = new Product(productId,name,price,stock);
        admin.addProduct(obj);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>product list as follow<<<<<<<<<<<<<<<<<<<<");
        Map<Long, Product> productMap = Product.productMap;
        System.out.println("productId---name---price--stock");
        for (long productID : productMap.keySet()) {
            Product product = productMap.get(productID);
            if (product != null) {
                //展示这个商品对象
                System.out.println(product.getProductId() + "---------" + product.getName() + "-----" + product.getPrice() + "----" + product.getStockQuantity());
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>product list as above<<<<<<<<<<<<<<<<<<<<");
        
         */
    }
}
