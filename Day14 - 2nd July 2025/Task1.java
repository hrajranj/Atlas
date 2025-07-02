//Create  a custom node , add elements to it and traverse it.


class Node<T> {
    T data;
    Node<T> next;


    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}


class MyLinkedList<T> {
    private Node<T> head;


    // Add element at the end of the list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    // Traverse and display the list
    public void traverse() {
        Node<T> current = head;
        System.out.println("Linked List elements:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}


public class Task1 {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
       
        // Add elements using custom add method
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");


        // Display the elements
        list.traverse();
    }
}
