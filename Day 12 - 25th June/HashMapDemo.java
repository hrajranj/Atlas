import java.util.HashMap;

public class HashMapDemo {
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

    }
}