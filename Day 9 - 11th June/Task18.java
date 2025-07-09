class OuterClass {
    int x = 50;

    class InnerClass {
        public int innerMethod() {
            return x; // Direct access to outer class member
        }
    }
}

public class Task18 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(inner.innerMethod()); // Output: 50
    }
}
