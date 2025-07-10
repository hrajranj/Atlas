// This code demonstrates how to create a LinkedList, add items to it, and iterate through the values using ListIterator.
// It is a continuation of the previous tasks related to LinkedLists.

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_task10 {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add a few items to the LinkedList
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");
        list.add("Orange");
        list.add("Strawberry");

        // Display the original LinkedList
        System.out.println("Original LinkedList: " + list);

        // Iterate through the values using ListIterator
        System.out.println("Iterating through LinkedList using ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
