// Description: This program prompts the user to enter a number between 1 and 7 and prints the corresponding day of the week.
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (1 to 7): ");

            // Check if input is an integer
            if (sc.hasNextInt()) {
                int day = sc.nextInt();

                switch (day) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Invalid input. Please enter a number between 1 and 7.");
                        continue; // Go back to the beginning of the loop
                }
                break; // Exit loop if valid day number (1–7)
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); // Clear the invalid input
            }
        }

        sc.close();
    }
}

