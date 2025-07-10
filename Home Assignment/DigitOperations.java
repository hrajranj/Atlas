import java.util.Scanner;

public class DigitOperations {
    public static int countDigits(int num) {
        if (num == 0) return 0;
        return 1 + countDigits(num / 10);
    }

    public static int sumDigits(int num) {
        if (num == 0) return 0;
        return (num % 10) + sumDigits(num / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        System.out.println("Digit count: " + countDigits(number));
        System.out.println("Sum of digits: " + sumDigits(number));
    }
}
