// Node class for both binary tree and BST
class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode() {
        this.value = 0;
        this.left = this.right = null;
    }

    TreeNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}

// Binary Search Tree class with insert and inorder
class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    // Insert method: handles empty tree and recursive inserts
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
            System.out.println("Inserted root: " + value);
        } else {
            insertVal(root, value);
        }
    }

    // Recursive insert method
    private TreeNode insertVal(TreeNode node, int value) {
        if (node == null)
            return new TreeNode(value);

        if (value < node.value)
            node.left = insertVal(node.left, value);
        else if (value > node.value)
            node.right = insertVal(node.right, value);

        return node;
    }

    // Inorder traversal
    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
        System.out.println("=== Task 1: Simple Tree Creation ===");

        // Task 1: Manually creating a binary tree
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(15);

        System.out.print("Inorder Traversal of Simple Tree: ");
        inorderSimple(root1);
        System.out.println();

        System.out.println("\n=== Task 2: Binary Search Tree Insertion ===");

        // Task 2: Using BinarySearchTree class
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder Traversal of BST: ");
        bst.inorder(bst.root);
        System.out.println();
    }

    // Static method for inorder traversal of simple binary tree (Task 1)
    public static void inorderSimple(TreeNode node) {
        if (node != null) {
            inorderSimple(node.left);
            System.out.print(node.value + " ");
            inorderSimple(node.right);
        }
    }
}
