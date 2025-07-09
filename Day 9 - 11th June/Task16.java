class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class Task16 {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();

    // ❌ Compilation Error: Cannot access private inner class from outside
    OuterClass.InnerClass myInner = myOuter.new InnerClass();

    System.out.println(myInner.y + myOuter.x);
  }
}
