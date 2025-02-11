package PP_Demo;

public class CasheRegister_01 {

    public static void main(String[] args) {
        //scan products  -> add to cart -> calculate the price -> process payment ->  check out

        String productName = "apple";
        Double price = 2.99;
        Integer quantity = 2;

        Double total = price * quantity;
        Double payment = 10.0;

        if (payment < total) {
            System.out.println("Not enough money");
        } else {
            Double change = payment - total;
            System.out.println("Change: " + change);
        }

        System.out.println("Total: " + total );

    }
}