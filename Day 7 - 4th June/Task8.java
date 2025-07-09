//Greater of Two Numbers
// This program takes two integers as input and prints the greater of the two numbers.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Compare and print the greater number
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}
