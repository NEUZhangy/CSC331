package OOP_Abstraction;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Item> items = new ArrayList<>();
    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalPrice(List<Item> items) {
        double total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
