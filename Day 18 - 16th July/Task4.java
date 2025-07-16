// This Java program takes a list of numbers from the user, separates them into three groups based on their unit digit, and displays the groups.

import java.util.ArrayList;
import java.util.Scanner;

public class Task4
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: take numbers separated by space or comma
        System.out.println("Enter numbers separated by comma:");
        String input = sc.nextLine();

        // Remove spaces and split input by comma
        String[] parts = input.replaceAll(" ", "").split(",");

        // Lists to hold groups
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();

        for (String part : parts) {
            int num = Integer.parseInt(part);
            int unitDigit = num % 10;

            if (unitDigit == 0) {
                array1.add(num);
            } else if (unitDigit == 1) {
                array2.add(num);
            } else {
                array3.add(num);
            }
        }

        // Displaying the groups
        System.out.println("Array 1 has: " + array1);
        System.out.println("Array 2 has: " + array2);
        System.out.println("Array 3 has: " + array3);
    }
}
