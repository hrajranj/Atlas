class BinarySearchTree {

    // Tree Node definition
    class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    // Root of BST
    TreeNode root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Insert method for empty tree
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
            System.out.println(value + " inserted as root.");
        } else {
            insert(root, value);
        }
    }

    // Insert method when tree has 1 or more nodes
    private void insert(TreeNode current, int value) {
        if (value < current.data) {
            if (current.left == null) {
                current.left = new TreeNode(value);
                System.out.println(value + " inserted to the left of " + current.data);
            } else {
                insert(current.left, value);
            }
        } else if (value > current.data) {
            if (current.right == null) {
                current.right = new TreeNode(value);
                System.out.println(value + " inserted to the right of " + current.data);
            } else {
                insert(current.right, value);
            }
        } else {
            System.out.println(value + " already exists in the BST. Duplicates not allowed.");
        }
    }

    // Inorder Traversal (for testing)
    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    // Public method to call inorder
    public void display() {
        System.out.print("Inorder Traversal: ");
        inorder(root);
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);  // Inserting into empty tree
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        
        bst.display(); // Output the sorted BST
    }
}
