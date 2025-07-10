class RedBlackTree {

    static final boolean RED = true;
    static final boolean BLACK = false;

    class Node {
        int data;
        boolean color;
        Node left, right, parent;

        Node(int data) {
            this.data = data;
            this.color = RED;
        }
    }

    private Node root;

    // Left rotate
    private void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if (y.left != null) y.left.parent = x;
        y.parent = x.parent;
        if (x.parent == null) root = y;
        else if (x == x.parent.left) x.parent.left = y;
        else x.parent.right = y;
        y.left = x;
        x.parent = y;
    }

    // Right rotate
    private void rightRotate(Node y) {
        Node x = y.left;
        y.left = x.right;
        if (x.right != null) x.right.parent = y;
        x.parent = y.parent;
        if (y.parent == null) root = x;
        else if (y == y.parent.left) y.parent.left = x;
        else y.parent.right = x;
        x.right = y;
        y.parent = x;
    }

    // Insert a new node
    public void insert(int data) {
        Node newNode = new Node(data);
        root = bstInsert(root, newNode);
        fixViolation(newNode);
    }

    // BST insert
    private Node bstInsert(Node root, Node node) {
        if (root == null) return node;
        if (node.data < root.data) {
            root.left = bstInsert(root.left, node);
            root.left.parent = root;
        } else if (node.data > root.data) {
            root.right = bstInsert(root.right, node);
            root.right.parent = root;
        }
        return root;
    }

    // Fix Red-Black Tree violations after insert
    private void fixViolation(Node node) {
        Node parent = null;
        Node grandparent = null;

        while (node != root && node.parent.color == RED) {
            parent = node.parent;
            grandparent = parent.parent;

            if (parent == grandparent.left) {
                Node uncle = grandparent.right;

                if (uncle != null && uncle.color == RED) {
                    // Case 1: Recolor
                    parent.color = BLACK;
                    uncle.color = BLACK;
                    grandparent.color = RED;
                    node = grandparent;
                } else {
                    if (node == parent.right) {
                        // Case 2: Left Rotation
                        node = parent;
                        leftRotate(node);
                    }
                    // Case 3: Right Rotation
                    parent.color = BLACK;
                    grandparent.color = RED;
                    rightRotate(grandparent);
                }
            } else {
                Node uncle = grandparent.left;

                if (uncle != null && uncle.color == RED) {
                    parent.color = BLACK;
                    uncle.color = BLACK;
                    grandparent.color = RED;
                    node = grandparent;
                } else {
                    if (node == parent.left) {
                        node = parent;
                        rightRotate(node);
                    }
                    parent.color = BLACK;
                    grandparent.color = RED;
                    leftRotate(grandparent);
                }
            }
        }
        root.color = BLACK;
    }

    // Inorder traversal
    public void inorder() {
        inorderHelper(root);
    }

    private void inorderHelper(Node node) {
        if (node != null) {
            inorderHelper(node.left);
            System.out.print(node.data + "(" + (node.color == RED ? "R" : "B") + ") ");
            inorderHelper(node.right);
        }
    }

    // Main method
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        int[] values = {10, 20, 30, 15, 25, 5, 1};

        for (int val : values) {
            tree.insert(val);
        }

        System.out.println("Inorder traversal (with color):");
        tree.inorder();
    }
}
