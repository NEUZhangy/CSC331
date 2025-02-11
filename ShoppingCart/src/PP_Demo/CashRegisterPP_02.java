package PP_Demo;

import java.util.*;

public class CashRegisterPP_02 {
    static Map<String, Double> products = new HashMap<>();
    static List<Map<String, Object>> cart = new ArrayList<>();


    //discount for fruit * 0.9
    //discount for milk membership * 0.8

    static {
        products.put("apple", 2.99);
        products.put("banana", 0.99);
        products.put("milk", 7.99);
    }

    //scan product and add into cart
    public static void scanProduct(String productName, Integer quantity) {

        if (products.containsKey(productName)) {
            Map<String, Object> item = new HashMap<>();
            item.put("name", productName);
            item.put("price", products.get(productName));
            item.put("quantity", quantity);
            cart.add(item);
        }
        else {
            //TODO: should have more complex logic here
            System.out.println("this is no such item: " + productName);
        }
    }
    //calculate the total price
    public  static  double calculateTotal () {
        double total = 0;
        for (Map<String, Object> item: cart) {
            double price = (double) item.get("price");
            int quantity = (int) item.get("quantity");
            total += price * quantity;
        }
        return total;
    }

    //check out  the cart
    public static void checkOut(double payment) {
        double total = calculateTotal();
        if(payment < total) {
            System.out.println("Not enough money");
        } else {
            double change = payment - total;
            System.out.println("Change: " + (payment - total));
        }
    }

    public static void main(String[] args) {
        scanProduct("apple", 2);
        scanProduct("banana", 3);
        scanProduct("milk", 1);
        System.out.println("Total: " + calculateTotal());
        checkOut(20);
    }
}
