import java.util.*;

// ============================================================
// 1. Point class implementing Comparable
// ============================================================
class Point implements Comparable<Point> {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Natural ordering:
    // Sort Points according to x coordinate
    @Override
    public int compareTo(Point p) {
        return this.x - p.x;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// ============================================================
// 2. Comparator for Point
// ============================================================

class PointComparator implements Comparator<Point> {

    // Sort Points according to x coordinate
    @Override
    public int compare(Point p1, Point p2) {
        return p1.x - p2.x;
    }
}
// ============================================================
// Main class
// ============================================================
public class CollectionsSort {

    public static void main(String[] args) {
        // ====================================================
        // Example 1: Collections.sort() with Integer
        // ====================================================
        System.out.println("----- Example 1: Integer -----");
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);

        System.out.println("Before sorting: " + numbers);

        // Natural ascending order
        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);

        // ====================================================
        // Example 2: Reverse order
        // ====================================================
        System.out.println("\n----- Example 2: Reverse Order -----");
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + numbers);
        // ====================================================
        // Example 3: Point implements Comparable
        // ====================================================
        System.out.println("\n----- Example 3: Comparable -----");

        List<Point> points = new ArrayList<>();

        points.add(new Point(10, 30));
        points.add(new Point(2, 20));
        points.add(new Point(5, 10));

        System.out.println("Before sorting: " + points);

        // Uses Point.compareTo()
        Collections.sort(points);

        System.out.println("After sorting: " + points);

        // ====================================================
        // Example 4: Comparator
        // ====================================================

        System.out.println("\n----- Example 4: Comparator -----");

        List<Point> points2 = new ArrayList<>();

        points2.add(new Point(10, 30));
        points2.add(new Point(2, 20));
        points2.add(new Point(5, 10));

        System.out.println("Before sorting: " + points2);

        // Uses PointComparator.compare()
        Collections.sort(points2, new PointComparator());

        System.out.println("After sorting: " + points2);


        // ====================================================
        // Example 5: LinkedList
        // ====================================================
        System.out.println("\n----- Example 5: LinkedList -----");

        List<Integer> linkedNumbers = new LinkedList<>();

        linkedNumbers.add(30);
        linkedNumbers.add(10);
        linkedNumbers.add(20);
        linkedNumbers.add(5);

        System.out.println("Before sorting: " + linkedNumbers);
        Collections.sort(linkedNumbers);
        System.out.println("After sorting: " + linkedNumbers);

        // ====================================================
        // Example 6: Reverse Point order
        // ====================================================
        System.out.println("\n----- Example 6: Reverse Point Order -----");

        List<Point> points3 = new ArrayList<>();

        points3.add(new Point(10, 30));
        points3.add(new Point(2, 20));
        points3.add(new Point(5, 10));

        System.out.println("Before sorting: " + points3);
        Collections.sort(points3, Collections.reverseOrder());
        System.out.println("After reverse sorting: " + points3);
    }
}