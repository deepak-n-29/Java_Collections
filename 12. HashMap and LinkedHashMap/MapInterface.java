import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer, String> m = new TreeMap<>();
        m.put(100,"GFG");
        m.put(200, "Courses");
        m.put(150, "IDE");

        Map<Integer, String> m1 = new HashMap<>();
        m1.put(100,"GFG");
        m1.put(200, "Courses");
        m1.put(150, "IDE");

        Map<Integer, String> m2 = new LinkedHashMap<>();
        m2.put(100,"GFG");
        m2.put(200, "Courses");
        m2.put(150, "IDE");

        System.out.println(m);
        System.out.println(m1);
        System.out.println(m2);

    }
}
