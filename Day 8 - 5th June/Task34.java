public class Task34 {

    // Method with two parameters
    void add(int x, int y) {
        System.out.println("x: " + x + ", y: " + y);
    }

    // Overloaded method with three parameters
    void add(int x, int y, int z) {
        System.out.println("x: " + x + ", y: " + y + ", z: " + z);
    }

    public static void main(String[] args) {
        Task34 obj = new Task34();

        obj.add(10, 20, 30);   // Calls method with 3 parameters
        obj.add(50, 100);      // Calls method with 2 parameters
    }
}
