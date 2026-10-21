import java.util.Arrays;
import java.util.Comparator;

/*
 * BinarySearchDemo.java
 *
 * Demonstrates:
 * 1. Binary Search on primitive arrays
 * 2. Binary Search on a sub-array
 * 3. Element not found (Insertion Point)
 * 4. Duplicate elements
 * 5. Binary Search using Comparable
 * 6. Binary Search using Comparator
 */

public class BinarySearchDemo {

    public static void main(String[] args) {

        // ==========================================================
        // 1. Binary Search on Primitive Array
        // ==========================================================
        int[] arr = {10, 20, 25, 30, 40};

        System.out.println("Array : " + Arrays.toString(arr));

        // Search existing element
        int index = Arrays.binarySearch(arr, 20);
        System.out.println("\n20 found at index : " + index);

        // Search within range [1,4)
        index = Arrays.binarySearch(arr, 1, 4, 25);
        System.out.println("25 found in range [1,4) at index : " + index);
        // ==========================================================
        // 2. Element NOT Found
        // ==========================================================
        int result = Arrays.binarySearch(arr, 22);

        System.out.println("\nSearching 22");
        System.out.println("Returned value : " + result);

        if (result < 0) {

            // Formula:
            int insertionPoint = -(result + 1);

            System.out.println("Insertion Point : " + insertionPoint);

            if (insertionPoint < arr.length)
                System.out.println("Next Greater Element : " + arr[insertionPoint]);

            if (insertionPoint > 0)
                System.out.println("Next Smaller Element : " + arr[insertionPoint - 1]);
        }
        // ==========================================================
        // 3. Duplicate Elements
        // ==========================================================
        int[] duplicate = {10, 20, 20, 20, 30};

        int duplicateIndex = Arrays.binarySearch(duplicate, 20);

        System.out.println("\nDuplicate Array : " + Arrays.toString(duplicate));
        System.out.println("Returned Index : " + duplicateIndex);
        System.out.println("(Can be any occurrence of 20)");
        // ==========================================================
        // 4. Binary Search using Comparable
        // ==========================================================
        PointComparable[] points1 = {
                new PointComparable(10, 20),new PointComparable(20, 30),
                new PointComparable(25, 5),new PointComparable(40, 15)
        };

        PointComparable key1 = new PointComparable(25, 5);
        int pointIndex = Arrays.binarySearch(points1, key1);

        System.out.println("\nBinary Search using Comparable");
        System.out.println("Found at index : " + pointIndex);
        // ==========================================================
        // 5. Binary Search using Comparator
        // ==========================================================
        Point[] points2 = {
                new Point(10, 20),new Point(20, 30),
                new Point(25, 5),new Point(40, 15)
        };

        Point key2 = new Point(25, 5);
        int comparatorIndex = Arrays.binarySearch(points2,key2,new PointComparator());

        System.out.println("\nBinary Search using Comparator");
        System.out.println("Found at index : " + comparatorIndex);
        // ==========================================================
        // 6. Comparator using Lambda (Java 8+)
        // ==========================================================
        Comparator<Point> cmp = (p1, p2) -> p1.x - p2.x;

        int lambdaIndex = Arrays.binarySearch(points2, key2, cmp);

        System.out.println("\nBinary Search using Lambda Comparator");
        System.out.println("Found at index : " + lambdaIndex);
    }
}

/*==========================================================
    Comparable Example
==========================================================*/

class PointComparable implements Comparable<PointComparable> {
    int x;
    int y;

    PointComparable(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Natural ordering based on x-coordinate
    @Override
    public int compareTo(PointComparable other) {
        return this.x - other.x;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
/*==========================================================
    Comparator Example
==========================================================*/
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
class PointComparator implements Comparator<Point> {

    @Override
    public int compare(Point p1, Point p2) {

        // Sort according to x-coordinate
        return p1.x - p2.x;
    }
}