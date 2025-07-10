import java.util.LinkedList;

public class LinkedList_Task5 {
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

        // Replace the 3rd element (index 2) with a different value
        list.set(2, "Peach");

        // Display the modified list
        System.out.println("Modified LinkedList: " + list);
    }
}
