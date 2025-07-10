public class NullTerminatedReverser {
    // Recursive method to reverse a null-terminated char array
    public static void reverse(char[] str, int index) {
        if (str[index] == '\0') {
            return; // Base case: reached null terminator
        }
        reverse(str, index + 1); // Recurse deeper
        System.out.print(str[index]); // Print in reverse order
    }

    public static void main(String[] args) {
        // Simulating a null-terminated string manually
        char[] str = {'R', 'a', 'j', 'e', 'e', 'v', '\0'};
        
        System.out.print("Reversed string: ");
        reverse(str, 0);
    }
}
