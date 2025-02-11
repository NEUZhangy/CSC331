package OOP_Abstraction;

import java.util.List;
import java.util.Map;

public class CashRegister {


    public void scanProduct(Product product, int quantity) {
        System.out.println("Scanning product: " + product.getName() + " " + product.getPrice() + " " + quantity);
    }




    public void checkOut(double payment, double totalPrice) {
        if (payment < totalPrice) {
            System.out.println("Not enough money");
        } else {
            double change = payment - totalPrice;
            System.out.println("Change: " + change);
        }
    }

    public void printRecipet() {
        System.out.println("Printing receipt...");
    }
}
