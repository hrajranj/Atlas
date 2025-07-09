//print numbers from 10 to 1, skipping 7 and 5  

public class Task13 {
    public static void main(String[] args) {
        System.out.println("Numbers from 10 to 1, skipping 7 and 5:");

        for (int i = 10; i >= 1; i--) {
            if (i == 7 || i == 5) {
                continue; // Skip 7 and 5
            }
            System.out.println(i);
        }
    }
}

