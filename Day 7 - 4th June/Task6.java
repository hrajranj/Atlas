import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your login id: ");
        String id = sc.nextLine();

        System.out.print("Enter your password: ");
        String pwd = sc.nextLine();

        // Masking password using asterisks
        String maskedPwd = "*".repeat(pwd.length());

        // Displaying output
        System.out.println("\nHi ,");
        System.out.println("Your login id is " + id);
        System.out.println("And your pwd is " + maskedPwd);
    }
}
