
import java.util.LinkedList;

public class LinkedList_Task9 {
    public static void main(String[] args) {
        // Create the first LinkedList
        LinkedList<String> originalList = new LinkedList<>();

        // Add a few items to the original LinkedList
        originalList.add("Apple");
        originalList.add("Mango");
        originalList.add("Grapes");
        originalList.add("Orange");
        originalList.add("Strawberry");

        // Display the original LinkedList
        System.out.println("Original LinkedList: " + originalList);

        // Clone the original LinkedList to create the second LinkedList
        LinkedList<String> clonedList = (LinkedList<String>) originalList.clone();

        // Display the cloned LinkedList
        System.out.println("Cloned LinkedList: " + clonedList);
    }
}
