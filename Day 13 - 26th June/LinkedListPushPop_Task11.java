// This code demonstrates how to use the push and pop methods of a LinkedList in Java.

import java.util.LinkedList;

public class LinkedListPushPop_Task11 {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add a few items to the LinkedList using push (adds to the front)
        list.push("Apple");
        list.push("Mango");
        list.push("Grapes");
        list.push("Orange");
        list.push("Strawberry");

        // Display the LinkedList after push operations
        System.out.println("LinkedList after push operations: " + list);

        // Remove items from the LinkedList using pop (removes from the front)
        System.out.println("Popped item: " + list.pop());
        System.out.println("Popped item: " + list.pop());

        // Display the LinkedList after pop operations
        System.out.println("LinkedList after pop operations: " + list);
    }
}
