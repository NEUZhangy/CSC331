package OOP_Abstraction;

public class Item {
    private Product product;
    private int quantity;


    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void getProduct() {
        System.out.println("Product: " + product.getName());
    }

    public void getQuantity() {
        System.out.println("Quantity: " + quantity);
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
     //   System.out.println("Total price: " + totalPrice);
    }
}
