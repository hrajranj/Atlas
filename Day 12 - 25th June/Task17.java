// This code demonstrates the use of HashMap with String keys and String values.
import java.util.HashMap;

public class Task17 {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();

        // put() with String values
        hashMap.put("Rajeev", "Twenty Four");
        hashMap.put("Ravi", "Twenty Five");
        hashMap.put("Rahul", "Twenty One");

        // get()
        System.out.println("Rajeev's Age (in words): " + hashMap.get("Rajeev"));

        // print all
        System.out.println("\nHashMap Contents:");
        for (String name : hashMap.keySet()) {
            System.out.println(name + " → " + hashMap.get(name));
        }
    }
}
