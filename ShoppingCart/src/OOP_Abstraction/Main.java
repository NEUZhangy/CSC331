package OOP_Abstraction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", 2.99);
        Item appleItem = new Item(apple, 2);

        Product orange = new Product("Orange", 0.99);
        Item orangeItem = new Item(apple, 2);


        List<Item> itemList = new ArrayList<>();
        itemList.add(appleItem);
        itemList.add(orangeItem);

//        appleItem.calculatePrice(apple, 2);
        CashRegister Alice = new CashRegister();
        Alice.scanProduct(apple, 2);
        Alice.scanProduct(orange, 2);
        //Alice.checkOut(10, Alice.calculateTotalPrice(itemList));
        Alice.printRecipet();

    }
}
