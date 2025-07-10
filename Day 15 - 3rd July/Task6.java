//Task 6: Create  a binary search operation on tree


// TreeNode class
class TreeNode {
    int value;
    TreeNode left, right;


    TreeNode(int value) {
        this.value = value;
        this.left = this.right = null;
    }
}


// Binary Search Tree class with insert and search
class BinarySearchTree {
    TreeNode root;


    BinarySearchTree() {
        root = null;
    }


    // Insert node
    public void insert(int value) {
        root = insertRec(root, value);
    }


    private TreeNode insertRec(TreeNode node, int value) {
        if (node == null) return new TreeNode(value);


        if (value < node.value)
            node.left = insertRec(node.left, value);
        else if (value > node.value)
            node.right = insertRec(node.right, value);


        return node;
    }


    // Search method
    public boolean search(int target) {
        return searchRec(root, target);
    }


    private boolean searchRec(TreeNode node, int target) {
        if (node == null) return false;
        if (node.value == target) return true;


        if (target < node.value)
            return searchRec(node.left, target);
        else
            return searchRec(node.right, target);
    }


    // Inorder display
    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }
}


// Main class
public class Task6 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();


        // Insert values into BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);


        // Inorder traversal (sorted order)
        System.out.print("BST (inorder): ");
        bst.inorder(bst.root);
        System.out.println();


        // Search for values
        int searchValue1 = 40;
        int searchValue2 = 90;


        System.out.println("\nSearching for " + searchValue1 + ": " + (bst.search(searchValue1) ? "Found" : "Not Found"));
        System.out.println("Searching for " + searchValue2 + ": " + (bst.search(searchValue2) ? "Found" : "Not Found"));
    }
}
