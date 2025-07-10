import java.util.LinkedList;

public class LinkedList_Task6 {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add 5 elements to the LinkedList
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");
        list.add("Orange");
        list.add("Strawberry");

        // Display the original list
        System.out.println("Original LinkedList: " + list);

        // Remove an element
        list.remove("Orange");

        // Display the modified list
        System.out.println("Modified LinkedList: " + list);
        
        // Remove an element by index (e.g., index 2)
        list.remove(2);
        // Display the list after index removal
        System.out.println("LinkedList after removing element at index 2: " + list);
    }
}
