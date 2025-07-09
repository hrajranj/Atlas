public class Task35 {

    // Method for characters
    void add(char x, char y) {
        System.out.println("char x: " + x + ", char y: " + y);
    }

    // Method for integers
    void add(int x, int y) {
        System.out.println("int x: " + x + ", int y: " + y);
    }

    // Main method
    public static void main(String[] args) {
        Task35 obj = new Task35();

        obj.add('d', 'a');      // Calls add(char, char)
        obj.add(100, 100);      // Calls add(int, int)
    }
}
