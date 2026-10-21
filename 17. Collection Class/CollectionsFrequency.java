import java.util.*;

public class CollectionsFrequency {

    // =========================================================
    // 1. BASIC EXAMPLE
    // =========================================================
    static void basicExample() {

        System.out.println("===== 1. Basic Example =====");

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);

        // Counts how many times 10 occurs
        int count10 = Collections.frequency(list, 10);

        // Counts how many times 20 occurs
        int count20 = Collections.frequency(list, 20);

        System.out.println("List: " + list);
        System.out.println("Frequency of 10: " + count10);
        System.out.println("Frequency of 20: " + count20);
    }

    // =========================================================
    // 2. FREQUENCY WITH OTHER COLLECTIONS
    // =========================================================
    static void otherCollectionsExample() {

        System.out.println("\n===== 2. Other Collections =====");

        // -------------------------
        // LinkedList
        // -------------------------
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);

        System.out.println("LinkedList: " + linkedList);
        System.out.println("Frequency of 10: "+ Collections.frequency(linkedList, 10));
        // -------------------------
        // ArrayDeque
        // -------------------------
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.add(20);
        deque.add(10);

        System.out.println("ArrayDeque: " + deque);
        System.out.println("Frequency of 10: "+ Collections.frequency(deque, 10));

        // -------------------------
        // PriorityQueue
        // -------------------------
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(10);

        System.out.println("PriorityQueue: " + pq);

        System.out.println("Frequency of 10: "+ Collections.frequency(pq, 10));
    }
    // =========================================================
    // 3. FREQUENCY WITH SET
    // =========================================================
    static void setExample() {

        System.out.println("\n===== 3. HashSet Example =====");

        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println("Set: " + set);

        /*
         * HashSet stores only unique elements.
         *
         * Therefore every element can occur only once.
         */
        System.out.println("Frequency of 10: "+ Collections.frequency(set, 10));
    }
    // =========================================================
    // 4. USER-DEFINED CLASS WITHOUT equals()
    // =========================================================
    static class PointWithoutEquals {

        int x;
        int y;

        PointWithoutEquals(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }


    static void withoutEqualsExample() {

        System.out.println(
                "\n===== 4. User-defined Class WITHOUT equals() ====="
        );

        List<PointWithoutEquals> points = new ArrayList<>();

        points.add(new PointWithoutEquals(10, 20));
        points.add(new PointWithoutEquals(10, 20));
        points.add(new PointWithoutEquals(30, 40));

        // This is a separate object.
        PointWithoutEquals target = new PointWithoutEquals(10, 20);
        int count = Collections.frequency(points, target);

        System.out.println("Points: " + points);
        System.out.println("Frequency of " + target + ": " + count);

        /*
         * Output:
         * Frequency of (10,20): 0
         * 
         * Why?
         * PointWithoutEquals does NOT override equals().
         *
         * Therefore Object.equals() is used.
         *
         * Object.equals() compares object references.
         *
         * target is a different object from the
         * two Point objects stored in the list.
         */
    }
    // =========================================================
    // 5. USER-DEFINED CLASS WITH equals()
    // =========================================================
    static class Point {

        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        /*
         * Override equals() so that two Point objects
         * are considered equal when their x and y
         * values are equal.
         */
        @Override
        public boolean equals(Object obj) {
            // Same object
            if (this == obj) {
                return true;
            }

            // null or different type
            if (!(obj instanceof Point)) {
                return false;
            }

            // Convert Object to Point
            Point other = (Point) obj;

            // Compare values
            return this.x == other.x && this.y == other.y;
        }
    }

    static void withEqualsExample() {
        System.out.println("\n===== 5. User-defined Class WITH equals() =====");
        List<Point> points = new ArrayList<>();

        points.add(new Point(10, 20));
        points.add(new Point(10, 20));
        points.add(new Point(30, 40));

        // New Point object
        Point target = new Point(10, 20);

        int count = Collections.frequency(points, target);
        System.out.println("Points: " + points);
        System.out.println("Frequency of " + target + ": " + count);

        /*
         * Output:
         *
         * Frequency of (10,20): 2
         *
         * Why?
         *
         * We override equals().
         *
         * Therefore:
         *
         * (10,20) == (10,20)
         *
         * according to our equality rule.
         */
    }


    // =========================================================
    // 6. FREQUENCY IN AN ARRAY
    // =========================================================
    static void arrayExample() {
        System.out.println("\n===== 6. Array Example =====");
        Integer[] arr = {10, 5, 10, 20};

        /*
         * Arrays.asList() converts the Integer[]
         * into a List wrapper.
         *
         * Then Collections.frequency() can be used.
         */
        List<Integer> list = Arrays.asList(arr);

        int count =Collections.frequency(list, 10);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Frequency of 10: " + count);
    }

    // =========================================================
    // 7. FREQUENCY OF STRING
    // =========================================================
    static void stringExample() {

        System.out.println("\n===== 7. String Example =====");

        List<String> names = new ArrayList<>();

        names.add("Java");
        names.add("Python");
        names.add("Java");
        names.add("Spring");
        names.add("Java");

        int count = Collections.frequency(names, "Java");

        System.out.println("Names: " + names);
        System.out.println("Frequency of Java: " + count);
    }


    // =========================================================
    // MAIN METHOD
    // =========================================================
    public static void main(String[] args) {
        basicExample();
        otherCollectionsExample();
        setExample();
        withoutEqualsExample();
        withEqualsExample();
        arrayExample();
        stringExample();
    }
}