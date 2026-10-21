import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // ==========================
        // Creating HashMap
        // ==========================
        HashMap<String, Integer> map = new HashMap<>();

        // ==========================
        // Adding Elements - put()
        // ==========================
        map.put("GFG", 10);
        map.put("IDE", 15);
        map.put("Courses", 20);

        System.out.println("HashMap:");
        System.out.println(map);

        // ==========================
        // Size
        // ==========================
        System.out.println("\nSize:");
        System.out.println(map.size());

        // ==========================
        // Traversing using entrySet()
        // ==========================
        System.out.println("\nTraversing HashMap:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ==========================
        // containsKey()
        // ==========================
        System.out.println("\ncontainsKey(\"IDE\"):");
        System.out.println(map.containsKey("IDE"));

        System.out.println("\ncontainsKey(\"Java\"):");
        System.out.println(map.containsKey("Java"));

        // ==========================
        // remove()
        // ==========================
        System.out.println("\nRemoving IDE");
        Integer removedValue = map.remove("IDE");

        System.out.println("Removed Value: " + removedValue);

        System.out.println("HashMap After Removal:");
        System.out.println(map);

        // ==========================
        // Size After Removal
        // ==========================
        System.out.println("\nSize:");
        System.out.println(map.size());

        // ==========================
        // containsValue()
        // ==========================
        System.out.println("\ncontainsValue(20):");
        System.out.println(map.containsValue(20));

        System.out.println("\ncontainsValue(15):");
        System.out.println(map.containsValue(15));

        // ==========================
        // get()
        // ==========================
        System.out.println("\nValue of key GFG:");
        System.out.println(map.get("GFG"));

        System.out.println("\nValue of key IDE:");
        System.out.println(map.get("IDE")); // null

        // ==========================
        // Replace Existing Value
        // ==========================
        map.put("Courses", 100);

        System.out.println("\nAfter Updating Courses:");
        System.out.println(map);

        // ==========================
        // getOrDefault()
        // ==========================
        System.out.println("\ngetOrDefault(\"Java\",0):");
        System.out.println(map.getOrDefault("Java", 0));

        // ==========================
        // keySet()
        // ==========================
        System.out.println("\nKeys:");
        System.out.println(map.keySet());

        // ==========================
        // values()
        // ==========================
        System.out.println("\nValues:");
        System.out.println(map.values());

        // ==========================
        // entrySet()
        // ==========================
        System.out.println("\nEntry Set:");
        System.out.println(map.entrySet());

        // ==========================
        // isEmpty()
        // ==========================
        System.out.println("\nisEmpty():");
        System.out.println(map.isEmpty());

        // ==========================
        // clear()
        // ==========================
        map.clear();

        System.out.println("\nAfter clear():");
        System.out.println(map);

        System.out.println("\nisEmpty():");
        System.out.println(map.isEmpty());

        System.out.println("\nSize:");
        System.out.println(map.size());
    }
}