package OOP_Demo;

public class CashRegisterOOP {

    public static void main(String[] args) {
        // initialize products
        Product apple = new Product("Apple", 0.99);
        Product banana = new Product("Banana", 0.59);
        Product orange = new Product("Orange", 0.79);

        // casher did
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(apple, 2);
        shoppingCart.addProduct(banana, 3);
        shoppingCart.addProduct(orange, 1);

        System.out.println(shoppingCart.printReceipt());
        shoppingCart.checkOut(10);
    }
}
