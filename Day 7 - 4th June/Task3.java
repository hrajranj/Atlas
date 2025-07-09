//Swapping two variables using a temporary variable
public class Task3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        System.out.println("Before swapping: a = " + a + " b = " + b);

        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + " b = " + b);
    }
}
