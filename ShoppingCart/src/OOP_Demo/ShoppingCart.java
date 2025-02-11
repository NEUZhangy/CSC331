package OOP_Demo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        CartItem item = new CartItem(product, quantity);
        items.add(item);
    }


    public void addCoupon () {}


    public double getTotalPrice() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }


    public void checkOut(double payment) {
        double total = getTotalPrice();
        if (payment < total) {
            System.out.println("Not enough money");
        } else {
            double change = payment - total;
            System.out.println("Change: " + change);
        }
    }

    public String printReceipt() {
        StringBuilder sb = new StringBuilder();
        for (CartItem item : items) {
            sb.append(item.printItem()).append("\n");
        }
        sb.append("Total: ").append(getTotalPrice());
        return sb.toString();
    }

}
