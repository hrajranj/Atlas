import java.util.Scanner;

public class ReverseStringRecursively {
    // Recursive method to reverse a string
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = input.nextLine();

        String reversed = reverse(original);
        System.out.println("Reversed string: " + reversed);
    }
}
