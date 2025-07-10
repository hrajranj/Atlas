import java.io.*;
import java.util.*;

public class Task17 {
    public static void main(String args[]) {
        FileOutputStream outfile = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to write into the file: ");
        String s = sc.nextLine();
        byte b1[] = s.getBytes();

        try {
            outfile = new FileOutputStream("FileName02.txt");
            outfile.write(b1);
            System.out.println("Write Byte");
            System.out.println("Thank You...!!!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
            System.exit(-1);
        } finally {
            try {
                if (outfile != null) outfile.close(); // ✅ Close the file stream
            } catch (IOException e) {
                System.out.println("Error closing file: " + e);
            }
        }
    }
}
