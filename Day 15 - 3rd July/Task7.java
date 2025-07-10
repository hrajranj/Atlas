class TreeNode{
    int value;
    TreeNode left,right;


    TreeNode(int value){
        this.value= value;
        this.left = this.right = null;


    }
}


//Binary tree
class BinarySearchTree{
    TreeNode root;


    public BinarySearchTree(){
        root = null;
    }
     
    //Insert
    public void insert(int value){
        root =  insertRec(root, value);
    }
    private TreeNode insertRec(TreeNode node, int value){
        if (node == null)
        return new TreeNode(value);


        if (value < node.value)
        node.left = insertRec(node.left, value);


        else if (value > node.value)
        node.right = insertRec(node.right, value);
       
        return node;                  
       
    }
   
    //Search
    public boolean search(int value) {
        return searchRec(root, value);
    }


    private boolean searchRec(TreeNode node, int value) {
        if (node == null) return false;
        if (value == node.value) return true;


        return value < node.value
            ? searchRec(node.left, value)
            : searchRec(node.right, value);
    }


    // Delete
    public void delete(int value) {
        root = deleteRec(root, value);
    }


    private TreeNode deleteRec(TreeNode node, int value) {
        if (node == null) return null;


        if (value < node.value) {
            node.left = deleteRec(node.left, value);
        } else if (value > node.value) {
            node.right = deleteRec(node.right, value);
        } else {
            // Case 1: No child
            if (node.left == null && node.right == null) {
                return null;
            }
            // Case 2: One child
            else if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            // Case 3: Two children
            node.value = minValue(node.right); // Replace with inorder successor
            node.right = deleteRec(node.right, node.value);
        }


        return node;
    }


    // Find min value (used for delete)
    private int minValue(TreeNode node) {
        int min = node.value;
        while (node.left != null) {
            node = node.left;
            min = node.value;
        }
        return min;
    }


    // Inorder Traversal
    public void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }
}


// Main class
public class Task7 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();


        // Insert nodes
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);


        // Inorder before delete
        System.out.print("Inorder Traversal (Before Delete): ");
        bst.inorder(bst.root);
        System.out.println();


        // Search
        int searchVal = 60;
        System.out.println("Search " + searchVal + ": " + (bst.search(searchVal) ? "Found" : "Not Found"));


        // Delete a node
        int deleteVal = 70;
        System.out.println("Deleting node: " + deleteVal);
        bst.delete(deleteVal);


        // Inorder after delete
        System.out.print("Inorder Traversal (After Delete): ");
        bst.inorder(bst.root);
        System.out.println();
    }
}
