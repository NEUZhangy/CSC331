package OOP_Demo;

public class DiscountProduct extends Product {
    private double discount;

    public DiscountProduct(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }


    public double getDiscount() {
        return discount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * (1 - discount);
    }

}
