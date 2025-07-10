import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void decimalToBinary(int num) {
        if (num == 0) {
            return;
        }
        decimalToBinary(num / 2);
        System.out.print(num % 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("Binary: 0");
        } else {
            System.out.print("Binary: ");
            decimalToBinary(number);
        }
    }
}
