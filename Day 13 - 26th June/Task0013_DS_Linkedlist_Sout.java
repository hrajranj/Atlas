import java.util.*;

public class Task0013_DS_Linkedlist_Sout {
    public static void main(String[] args) {

        LinkedList<String> lobj = new LinkedList<>();

        lobj.add("Prasunamba");
        lobj.add("Meher");
        lobj.add(".MK");

        Spliterator<String> sitobj = lobj.spliterator();

        System.out.println("Splitting the list:");

        // Using lambda to mimic sout (System.out.println)
        sitobj.forEachRemaining(element -> System.out.println(element));
    }
}
