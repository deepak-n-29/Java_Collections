import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put()
        map.put(10, "GFG");
        map.put(20, "IDE");
        map.put(15, "Courses");

        System.out.println("Initial Map:");
        System.out.println(map);

        // Updating an existing key
        map.put(20, "Practice");

        System.out.println("\nAfter Updating Key 20:");
        System.out.println(map);

        // Removing and inserting again
        map.remove(20);
        map.put(20, "Practice");

        System.out.println("\nAfter Removing and Re-Inserting:");
        System.out.println(map);

        // Traversal
        System.out.println("\nTraversal:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Other methods
        System.out.println("\ncontainsKey(15): " + map.containsKey(15));
        System.out.println("containsValue(\"GFG\"): " + map.containsValue("GFG"));
        System.out.println("get(10): " + map.get(10));
        System.out.println("size(): " + map.size());
    }
}