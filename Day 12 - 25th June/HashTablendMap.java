import java.util.HashMap;
import java.util.Hashtable;

public class HashTablendMap {
    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        // put()
        hashMap.put("Rajeev", 24);
        hashMap.put("Ravi", 25);
        hashMap.put("Rahul", 21);
        // get()
        System.out.println("HashMap - Rajeev's Age: " + hashMap.get("Rajeev"));
        System.out.println("\nHashMap Contents:");
        for (String name : hashMap.keySet()) {
            System.out.println(name + " → " + hashMap.get(name));
        }

        Hashtable<String, Integer> hashTable = new Hashtable<>();
        // put()
        hashTable.put("Neha", 23);
        hashTable.put("Priya", 20
        
        );
        hashTable.put("Riya", 14);
        // get()
        System.out.println("\nHashtable - Priya's Age: " + hashTable.get("Priya"));

        System.out.println("\nHashtable Contents:");
        for (String name : hashTable.keySet()) {
            System.out.println(name + " → " + hashTable.get(name));
        }
    }
}
