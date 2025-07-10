public class Task3B {
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


        System.out.print("Inorder Traversal (Task 2 - BST): ");
        bst.inorder(bst.root);
    }
}
