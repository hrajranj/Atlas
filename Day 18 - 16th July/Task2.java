//this code display digit by digit of a  number

import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        if (num < 10000 || num > 99999) {
            System.out.println("Please enter a valid 5-digit number.");
            return;
        }

        String[] places = {"Units digit", "Tens digit", "Hundreds digit", 
                           "Thousands digit", "Ten Thousands digit"};

        for (int i = 0; i < places.length; i++) {
            int digit = num % 10;
            System.out.println(places[i] + " is " + digit);
            num /= 10;
        }
    }
}
