public class Task20 {
    public static void main(String[] args) {
        // Initialize name as a character array
        char[] Name = {'R',  'a', 'j', 'e', 'e', 'v', };

        // Print full array as a string
        System.out.println(Name);  // prints the full name

        // Get length of the array
        int n = Name.length;

        // Print number of letters
        System.out.println("There are " + n + " letters in my name.");

        // Traverse and print each letter
        System.out.print("Letters in my name ");
        for (int i = 0; i < n; i++) {
            System.out.print(Name[i] + " ");
        }
    }
}
