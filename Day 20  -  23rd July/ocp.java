// Step 1: Create a common interface
interface PaymentMethod {
    void process(double amount);
}

// Step 2: Implement different payment types
class CreditCardPayment implements PaymentMethod {
    public void process(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}

class PayPalPayment implements PaymentMethod {
    public void process(double amount) {
        System.out.println("Processing PayPal payment of ₹" + amount);
    }
}

class BitcoinPayment implements PaymentMethod {
    public void process(double amount) {
        System.out.println("Processing Bitcoin payment of ₹" + amount);
    }
}

// Step 3: PaymentProcessor uses abstraction
class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.process(amount);
    }
}

// Step 4: Sample usage
public class ocp {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod payment1 = new CreditCardPayment();
        PaymentMethod payment2 = new PayPalPayment();
        PaymentMethod payment3 = new BitcoinPayment();

        processor.processPayment(payment1, 1000.0);
        processor.processPayment(payment2, 2500.0);
        processor.processPayment(payment3, 5000.0);
    }
}
