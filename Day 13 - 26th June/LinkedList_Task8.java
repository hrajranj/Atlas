import java.util.LinkedList;

public class LinkedList_Task8 {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add 5 elements to the LinkedList
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");
        list.add("Orange");
        list.add("Strawberry");

        // Display the original LinkedList
        System.out.println("Original LinkedList: " + list);

        // Convert the LinkedList to an array
        String[] array = list.toArray(new String[0]);

        // Display the array
        System.out.println("Array: ");
        for (String item : array) {
            System.out.println(item);
        }
    }
}
