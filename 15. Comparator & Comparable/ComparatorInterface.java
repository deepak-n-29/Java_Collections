import java.util.Arrays;
import java.util.Comparator;

/*
 * ============================================================
 * ComparatorInterface.java
 * ============================================================
 *
 * Comparator:
 * ----------
 * Used when:
 * 1. Class does NOT implement Comparable
 * 2. You want a DIFFERENT ordering than natural ordering
 *
 * Common Uses:
 * ------------
 * Arrays.sort()
 * Collections.sort()
 * Binary Search
 * TreeSet
 * TreeMap
 * PriorityQueue
 * Streams (sorted(), max(), min())
 *
 * compare(a,b)
 * -------------
 * return <0  -> a comes before b
 * return 0   -> equal
 * return >0  -> a comes after b
 *
 * ============================================================
 */

class Point {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

/*
 * Old Style Comparator
 *
 * Sort Points according to x-coordinate
 */
class MyComparator implements Comparator<Point> {

    @Override
    public int compare(Point p1, Point p2) {
         // Ascending order of x
        return Integer.compare(p1.x, p2.x);
        // Equivalent: return p1.x - p2.x;
    }
}

public class ComparatorInterface {

    public static void main(String[] args) {

        // =====================================================
        // Example 1 : Old Style Comparator Class
        // =====================================================

        System.out.println("========== Old Style Comparator ==========");

        Point[] points1 = {
                new Point(10, 20), new Point(5, 45),
                new Point(25, 15), new Point(15, 30)
        };
        Arrays.sort(points1, new MyComparator());
        System.out.println(Arrays.toString(points1));

        // =====================================================
        // Example 2 : Lambda Expression
        // =====================================================

        System.out.println("\n========== Lambda Comparator ==========");

        Point[] points2 = {
                new Point(10, 20), new Point(5, 45),
                new Point(25, 15), new Point(15, 30)
        };

        Arrays.sort(points2, (p1, p2) -> Integer.compare(p1.x, p2.x));
        System.out.println(Arrays.toString(points2));

        // =====================================================
        // Example 3 : Lambda (Descending Order)
        // =====================================================
        System.out.println("\n========== Lambda Descending ==========");

        Point[] points3 = {
                new Point(10, 20),new Point(5, 45),
                new Point(25, 15),new Point(15, 30)
        };

        Arrays.sort(points3, (p1, p2) -> Integer.compare(p2.x, p1.x));

        System.out.println(Arrays.toString(points3));

        // =====================================================
        // Example 4 : Method Reference
        // =====================================================
        System.out.println("\n========== Method Reference ==========");
        String[] words = {"gfg","IDE","GFG","Course"};

        Arrays.sort(words, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(words));

        // =====================================================
        // Example 5 : Natural Order
        // =====================================================
        System.out.println("\n========== Natural Order ==========");
        Integer[] nums1 = {30, 10, 50, 20};

        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

        // =====================================================
        // Example 6 : Reverse Order
        // =====================================================
        System.out.println("\n========== Reverse Order ==========");
        Integer[] nums2 = {30, 10, 50, 20};

        Arrays.sort(nums2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums2));

        // =====================================================
        // Example 7 : Sort Strings by Length
        // =====================================================
        System.out.println("\n========== Sort By Length ==========");
        String[] fruits = { "Apple","Kiwi","Banana","Orange","Fig"};

        Arrays.sort(fruits,(a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println(Arrays.toString(fruits));
        
        // =====================================================
        // Example 8 : Sort Points by Y Coordinate
        // =====================================================
        System.out.println("\n========== Sort By Y ==========");

        Point[] points4 = {
                new Point(10, 20),new Point(5, 45),
                new Point(25, 15),new Point(15, 30)
        };

        Arrays.sort(points4,(p1, p2) -> Integer.compare(p1.y, p2.y));
        System.out.println(Arrays.toString(points4));
    }
}