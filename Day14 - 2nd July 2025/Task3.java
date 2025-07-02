
//Create a Circular Linked list using Task 1 Singly linked list.


public class Task3 {
   
}
class Node {
    String data;
    Node next;


    Node(String data) {
        this.data = data;
        this.next = null;
    }
}


class CircularLinkedList {
    Node head = null;
    Node tail = null;


    // Add node at end
    public void add(String data) {
        Node newNode = new Node(data);


        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Circular link


        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain circular link
        }
    }


    // Traverse and print all elements
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }


        Node current = head;
        System.out.println("Circular Linked List:");
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }
}


public class Task1 {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();


        // Add elements
        cll.add("Apple");
        cll.add("Banana");
        cll.add("Cherry");


        // Traverse the list
        cll.traverse();
    }
}
