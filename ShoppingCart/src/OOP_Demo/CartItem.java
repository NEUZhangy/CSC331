package OOP_Demo;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public String printItem() {
        return product.getName() + " " + product.getPrice() + " " + quantity + " " + getTotalPrice();
    }

}
