class TreeNode {
    int value;
    TreeNode left, right;


    // Empty constructor
    TreeNode() {
        value = 0;
        left = right = null;
    }


    // Parameterized constructor
    TreeNode(int item) {
        value = item;
        left = right = null;
    }
}
public class Task1_tree {
    public static void main(String[] args) {
        // Using empty constructor
        TreeNode node1 = new TreeNode();
        node1.value = 100;


        // Using parameterized constructor
        TreeNode node2 = new TreeNode(200);


        // Connect nodes
        node1.left = node2;
        node1.right = new TreeNode(300);


        // Display
        System.out.println("Root: " + node1.value);
        System.out.println("Left Child: " + node1.left.value);
        System.out.println("Right Child: " + node1.right.value);
    }
}
