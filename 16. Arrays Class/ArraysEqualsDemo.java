import java.util.Arrays;
/*
 * ArraysEqualsDemo.java
 *
 * Demonstrates:
 * 1. Arrays.equals() with primitive arrays
 * 2. Arrays.equals() with wrapper objects
 * 3. Arrays.equals() on subarrays (Java 9+)
 * 4. Arrays.equals() with Comparator (Java 9+)
 */

public class ArraysEqualsDemo {
    public static void main(String[] args) {
        // =====================================================
        // 1. Primitive Arrays
        // =====================================================
        int[] a = {10, 15, 20};
        int[] b = {10, 15, 20};
        int[] c = {15, 10, 20};

        System.out.println("========== Primitive Arrays ==========");
        System.out.println("A : " + Arrays.toString(a));
        System.out.println("B : " + Arrays.toString(b));
        System.out.println("C : " + Arrays.toString(c));
        System.out.println("\nArrays.equals(a, b) : "+ Arrays.equals(a, b));
        System.out.println("Arrays.equals(a, c) : "+ Arrays.equals(a, c));
        // =====================================================
        // 2. Wrapper Object Arrays
        // =====================================================
        Integer[] x = {10, 15, null, 30};
        Integer[] y = {10, 15, null, 30};
        Integer[] z = {10, 15, 30, null};

        System.out.println("\n========== Wrapper Arrays ==========");

        System.out.println("X : " + Arrays.toString(x));
        System.out.println("Y : " + Arrays.toString(y));
        System.out.println("Z : " + Arrays.toString(z));

        System.out.println("\nArrays.equals(x, y) : "+ Arrays.equals(x, y));
        System.out.println("Arrays.equals(x, z) : "+ Arrays.equals(x, z));
        // =====================================================
        // 3. Compare Subarrays (Java 9+)
        // =====================================================
        int[] p = {10, 20, 30, 40, 60};
        int[] q = {30, 40, 60, 5, 8};

        System.out.println("\n========== Subarray Comparison ==========");

        System.out.println("P : " + Arrays.toString(p));
        System.out.println("Q : " + Arrays.toString(q));

        /*
         * Compare:
         *
         * P -> [2,5) -> 30 40 60
         * Q -> [0,3) -> 30 40 60
         */

        boolean ans = Arrays.equals( p, 2, 5,
                                     q, 0, 3);

        System.out.println("\nArrays.equals(P,2,5,Q,0,3) : "+ ans);
        // =====================================================
        // 4. Comparator Version (Java 9+)
        // =====================================================
        String[] s1 = {"GFG", "IDE"};
        String[] s2 = {"gfg", "ide"};

        System.out.println("\n========== Comparator Version ==========");

        System.out.println("S1 : " + Arrays.toString(s1));
        System.out.println("S2 : " + Arrays.toString(s2));

        // Normal comparison (case-sensitive)
        System.out.println("\nNormal equals()");
        System.out.println(Arrays.equals(s1, s2));

        // Ignore case using Comparator
        System.out.println("\nIgnore Case Comparator");
        System.out.println(Arrays.equals(s1,s2,String::compareToIgnoreCase));
    }
}