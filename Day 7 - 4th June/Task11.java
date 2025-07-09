// Description: This program prompts the user to enter a login ID and password, and keeps track of the number of successful logins.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctLoginId = "hrajranj";
        String correctPwd = "12345867";

        String loginid = "";
        String pwd = "";
        int count = 0;

        // Keep asking until correct credentials are entered
        while (true) {
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
        }

        // sc.close(); // Unreachable here because of infinite loop
    }
}
