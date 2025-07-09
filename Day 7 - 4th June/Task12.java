// login ID and password validation program using a do-while loop

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctLoginId = "hrajranj";
        String correctPwd = "12345867";

        String loginid;
        String pwd;
        int count = 0;

        do {
            System.out.println("Enter your login ID:");
            loginid = sc.nextLine();

            System.out.println("Enter your password:");
            pwd = sc.nextLine();

            if (loginid.equals(correctLoginId) && pwd.equals(correctPwd)) {
                count++;
                System.out.println("You have logged in for " + count + " times");
            } else {
                System.out.println("Invalid login ID or password. Try again.");
            }

        } while (true); // Infinite loop – remove 'true' and add a break condition if needed

        // sc.close(); // Unreachable in this form
    }
}
