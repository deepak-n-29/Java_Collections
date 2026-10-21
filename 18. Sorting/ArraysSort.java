import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class ArraysSort {

    // =========================================================
    // Point class implementing Comparable
    // =========================================================
    static class Point implements Comparable<Point> {

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


    // =========================================================
    // Point Comparator
    // =========================================================
    static class PointComparator implements Comparator<Point> {

        @Override
        public int compare(Point p1, Point p2) {
            return p1.x - p2.x;
        }
    }


    // =========================================================
    // Comparator for Even Numbers First
    // =========================================================
    static class EvenOddComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer a, Integer b) {
            // Even -> 0
            // Odd  -> 1
            return (a % 2) - (b % 2);
        }
    }


    public static void main(String[] args) {

        // =========================================================
        // 1. Arrays.sort() - Primitive int array
        // =========================================================
        int[] arr1 = {5, 20, 12, 30};

        System.out.println("1. Primitive int array");
        System.out.println("Before sorting: "+ Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println("After sorting:  "+ Arrays.toString(arr1));

        // =========================================================
        // 2. Arrays.sort() - Character array
        // =========================================================
        char[] arr2 = {'D', 'A', 'C', 'B', 'A'};

        System.out.println("\n2. Character array");
        System.out.println("Before sorting: "+ Arrays.toString(arr2));

        Arrays.sort(arr2);
        System.out.println("After sorting:  "+ Arrays.toString(arr2));

        // =========================================================
        // 3. Arrays.sort() - Subarray
        // =========================================================
        int[] arr3 = {5, 30, 20, 10, 8};

        System.out.println("\n3. Subarray sorting");
        System.out.println("Before sorting: "+ Arrays.toString(arr3));

        /*
         * fromIndex = 1 -> included
         * toIndex   = 4 -> excluded
         *
         * Therefore indexes 1, 2 and 3 are sorted.
         */

        Arrays.sort(arr3, 1, 4);
        System.out.println("After sorting:  "+ Arrays.toString(arr3));

        // =========================================================
        // 4. Sorting an Object array using Comparable
        // =========================================================

        Point[] points = {
                new Point(10, 20),
                new Point(3, 12),
                new Point(5, 7)
        };

        System.out.println("\n4. Object array using Comparable");

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(points));

        /*
         * Point implements Comparable.
         *
         * Arrays.sort() automatically calls
         * Point.compareTo().
         */

        Arrays.sort(points);

        System.out.println("After sorting by x:");
        System.out.println(Arrays.toString(points));

        // =========================================================
        // 5. Object array in reverse order
        // =========================================================

        Point[] pointsReverse = {
                new Point(10, 20),
                new Point(3, 12),
                new Point(5, 7)
        };

        System.out.println("\n5. Object array - Reverse order");
        Arrays.sort(pointsReverse,Collections.reverseOrder());
        System.out.println(Arrays.toString(pointsReverse));

        // =========================================================
        // 6. Object array using Comparator
        // =========================================================

        Point[] pointsComparator = {
                new Point(10, 20),
                new Point(3, 12),
                new Point(5, 7)
        };

        System.out.println("\n6. Object array using Comparator");

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(pointsComparator));

        Arrays.sort(pointsComparator,new PointComparator());

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(pointsComparator));


        // =========================================================
        // 7. Integer[] with custom Comparator
        //    Even numbers first, then odd numbers
        // =========================================================
        Integer[] numbers = {5, 20, 3, 10, 12};

        System.out.println("\n7. Custom Comparator - Even first");

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers,new EvenOddComparator());

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(numbers));

        // =========================================================
        // 8. Integer[] - Descending order
        // =========================================================
        Integer[] descending = {10, 5, 30, 20};

        System.out.println("\n8. Integer array - Descending order");
        Arrays.sort(descending,Collections.reverseOrder());
        System.out.println(Arrays.toString(descending));
    }
}