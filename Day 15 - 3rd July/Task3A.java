
public class Task3A {
   public Task3A() {
   }


   public static void inorder(TreeNode var0) {
      if (var0 != null) {
         inorder(var0.left);
         System.out.print(var0.value + " ");
         inorder(var0.right);
      }


   }


   public static void main(String[] var0) {
      TreeNode var1 = new TreeNode(10);
      var1.left = new TreeNode(5);
      var1.right = new TreeNode(15);
      System.out.print("Inorder Traversal (Task 1): ");
      inorder(var1);
   }
}
