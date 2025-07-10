import java.util.LinkedList;

public class LinkedList_Task7 {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add 5 elements to the LinkedList
        list.add("Apple");
        list.add("Mango");
        list.add("Grapes");
        list.add("Orange");
        list.add("Strawberry");

        // Display the list using a for loop with get()
        System.out.println("Displaying LinkedList using for loop with get():");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Display the list using a for-each loop
        System.out.println("Displaying LinkedList using for-each loop:");
        for (String element : list) {
            System.out.println(element);
        }
    }
}
