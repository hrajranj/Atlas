import java.util.HashMap;

public class NullKey {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "First Null Value");
        //map.put(null, "Updated Null Value");

        map.put("apple", "red");
        map.put("banana", "yellow");
        map.put("orange", "orange");
        map.put("guava", "green");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        System.out.println("Size of map: " + map.size());
    }
}

