import java.util.*;

public class HashMapSyncronized {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> syncMap = Collections.synchronizedMap(map);

        syncMap.put("Apple", 10);
        syncMap.put("Banana", 20);
        syncMap.put("orange", 25);
        syncMap.put("guava", 40);

        synchronized (syncMap) {
            for (Map.Entry<String, Integer> entry : syncMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}