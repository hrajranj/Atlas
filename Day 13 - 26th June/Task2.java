import java.util.*;

// Node class
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class CustomLinkedList<T> {
    private Node<T> head;
    private int size = 0;

    // Add at the end
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
        size++;
    }

    // Add at the beginning
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Remove from the beginning
    public T removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        T removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    // Get element at a specific index
    public T get(int index) {
        checkBounds(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Display all elements
    public void display() {
        Node<T> current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Size of the list
    public int size() {
        return size;
    }

    // Bounds check for get()
    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
    }
}

// Driver class with main method
public class Task2 {
    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5); // Adding at beginning

        // Display list
        list.display();

        // Remove first element
        int removed = list.removeFirst();
        System.out.println("Removed element: " + removed);

        // Display again
        list.display();

        // Print size
        System.out.println("Size of the list: " + list.size());

        // Get element at index 1
        System.out.println("Element at index 1: " + list.get(1));
    }
}
