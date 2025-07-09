class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

public class Task17 {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass(); // Not actually needed here
    OuterClass.InnerClass myInner = new OuterClass.InnerClass(); // Static inner class instantiation
    System.out.println(myInner.y + myOuter.x);
  }
}
