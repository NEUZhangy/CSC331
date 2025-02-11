package OOP_Abstraction;

public class Product {
    private String name;
    private Double unitPrice;

    public Product(String name, Double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }


    public String getName() {
        return name;
    }

    public Double getPrice() {
        return unitPrice;
    }

}
