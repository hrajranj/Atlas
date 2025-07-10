import java.util.LinkedList;
import java.util.Spliterator;

public class Task14_SplitLinkedListS {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList and add items
        LinkedList<String> items = new LinkedList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Elderberry");
        items.add("Fig");

        // Step 2: Create a Spliterator from the LinkedList
        Spliterator<String> it1 = items.spliterator();

        // Step 3: Split the iterator
        Spliterator<String> it2 = it1.trySplit();

        // Step 4: Traverse first half using it2
        System.out.println("Items from Spliterator 1:");
        it1.forEachRemaining((item) -> System.out.println("  " + item));

        // Step 5: Traverse second half using it1
        System.out.println("Items from Spliterator 2:");
        if (it2 != null) {
            it2.forEachRemaining((item) -> System.out.println("  " + item));
        } else {
            System.out.println("Spliterator couldn't split (too small).");
        }
    }
}
