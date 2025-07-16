import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        // Convert to positive if negative
        num = Math.abs(num);

        // Special case for 0
        if (num == 0) {
            System.out.println("Number of digits: 1");
            return;
        }

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
