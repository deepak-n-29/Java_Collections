import java.util.*;

public class CollectionsMaxMin {

    // ---------------------------------------------------------
    // Point class WITHOUT Comparable
    // We will use Comparator separately for Point objects.
    // ---------------------------------------------------------
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
    }
    // ---------------------------------------------------------
    // Comparator for Point
    //
    // Compare points using their X coordinate.
    //
    // p1.x - p2.x:
    // negative -> p1 is smaller
    // zero     -> both are equal
    // positive -> p1 is greater
    // ---------------------------------------------------------
    static class MyCmp implements Comparator<Point> {

        @Override
        public int compare(Point p1, Point p2) {
            return p1.x - p2.x;
        }
    }

    public static void main(String[] args) {

        // =====================================================
        // 1. Collections.max() and Collections.min()
        //    with Integer
        // =====================================================

        System.out.println("===== 1. Integer ArrayList =====");

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);

        System.out.println("List: " + numbers);

        // Integer implements Comparable.
        // Therefore Java knows the natural ordering.
        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));

        // =====================================================
        // 2. max() and min() work with other Collections too
        // =====================================================

        System.out.println("\n===== 2. HashSet =====");

        Set<Integer> numberSet = new HashSet<>();

        numberSet.add(10);
        numberSet.add(5);
        numberSet.add(20);

        System.out.println("Set: " + numberSet);
        System.out.println("Maximum: "+ Collections.max(numberSet));
        System.out.println("Minimum: "+ Collections.min(numberSet));

        // =====================================================
        // 3. User-defined class WITHOUT Comparable
        //    Use Comparator
        // =====================================================
        System.out.println("\n===== 3. Point + Comparator =====");

        List<Point> points = new ArrayList<>();

        points.add(new Point(5, 20));
        points.add(new Point(25, 10));
        points.add(new Point(10, 40));

        System.out.println("Points: " + points);

        // Create our Comparator
        MyCmp comparator = new MyCmp();

        // Find maximum using X coordinate
        Point maxPoint = Collections.max(points, comparator);
        // Find minimum using X coordinate
        Point minPoint = Collections.min(points, comparator);
        System.out.println("Maximum Point: " + maxPoint);
        System.out.println("Minimum Point: " + minPoint);

        // =====================================================
        // 4. Same Comparator using Lambda
        // =====================================================
        System.out.println("\n===== 4. Point + Lambda Comparator =====");
        Comparator<Point> lambdaComparator =(p1, p2) -> p1.x - p2.x;

        Point maxUsingLambda = Collections.max(points, lambdaComparator);
        Point minUsingLambda =Collections.min(points, lambdaComparator);

        System.out.println("Maximum Point: " + maxUsingLambda);
        System.out.println("Minimum Point: " + minUsingLambda);
        // =====================================================
        // 5. Finding max/min from an Integer[] array
        // =====================================================

        System.out.println("\n===== 5. Integer[] Array =====");
        Integer[] arr = {10, 20, 40, 5};

        // Arrays.asList() converts the Integer[] into a List.
        List<Integer> arrayList = Arrays.asList(arr);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Maximum: " + Collections.max(arrayList));
        System.out.println("Minimum: " + Collections.min(arrayList));

        // =====================================================
        // IMPORTANT:
        //
        // Collections.max()/min() work with Collections.
        //
        // They do NOT directly accept primitive arrays:
        //
        // int[] arr = {10, 20, 40, 5};
        //
        // Collections.max(arr);   // ❌
        //
        // Use Integer[] instead:
        //
        // Integer[] arr = {10, 20, 40, 5};
        // =====================================================
    }
}

// For your interview revision, the key relationship is:

// Comparable
//    ↓
// Natural ordering
//    ↓
// Collections.max(list)
// Collections.min(list)


// Comparator
//    ↓
// Custom ordering
//    ↓
// Collections.max(list, comparator)
// Collections.min(list, comparator)