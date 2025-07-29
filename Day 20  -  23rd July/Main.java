import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int[] marks = new int[3];
    double fees;

    // Method 1: Register student details
    void registrationDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter fees: ");
        fees = sc.nextDouble();
        System.out.println("Registration complete!\n");
    }

    // Method 2: Calculate total and average marks
    void marksCalc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 3 subjects:");
        int total = 0;
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double average = total / 3.0;
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average + "\n");
    }

    // Method 3: Display fees
    void feesCalc() {
        System.out.println("Fees paid: ₹" + fees + "\n");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.registrationDetails();
        s1.marksCalc();
        s1.feesCalc();
    }
}
