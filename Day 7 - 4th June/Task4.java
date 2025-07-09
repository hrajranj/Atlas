//add subtract multiply divide methods
public class Task4 {

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public static int divide(int a, int b) {
        // Prevent division by zero
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main started");

        int num1 = 20;
        int num2 = 4;

        System.out.println("Sum of 2 numbers is " + add(num1, num2));
        System.out.println("Diff of 2 numbers is " + subtract(num1, num2));
        System.out.println("Product of 2 numbers is " + multiply(num1, num2));
        System.out.println("Division of 2 numbers is " + divide(num1, num2));

        System.out.println("Main ended");
    }
}
