class Customer {
    // Class-level variables
    int cost = 40;
    String items = "Tomatoes";

    void purchaseList() {
        System.out.println("Purchase list: " + items + " - Cost: " + cost);
    }
}

public class Mart extends Customer {

    // Overriding parent class variables (not a good practice, but for example)
    int cost = 30;
    String items = "Onions";

    void billing() {
        System.out.println("Billing item: " + items + " - Cost: " + cost);
    }

    public static void main(String[] args) {
        Mart m = new Mart();

        // Access Mart's own variables
        System.out.println(m.items); // Onions
        System.out.println(m.cost);  // 30

        System.out.println("%%%%%%%%%%%%%%");

        // Access Customer's variables using super
        System.out.println(((Customer)m).items); // Tomatoes
        System.out.println(((Customer)m).cost);  // 40
    }
}

