public class Task36 {

    // Overloaded method: int, float
    void add(int x, float y) {
        System.out.println("add(int, float): x = " + x + ", y = " + y);
    }

    // Overloaded method: float, int
    void add(float x, int y) {
        System.out.println("add(float, int): x = " + x + ", y = " + y);
    }

    public static void main(String[] args) {
        Task36 obj = new Task36();

        obj.add(10.50f, 60);     // Matches add(float, int)
        obj.add(100, 80.80f);    // Matches add(int, float)
    }
}
