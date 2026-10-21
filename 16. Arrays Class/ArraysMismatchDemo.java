import java.util.Arrays;

public class ArraysMismatchDemo {
    public static void main(String[] args) {
        // =====================================================
        // Example 1 : Primitive Arrays
        // =====================================================
        int[] a = {10, 20, 30};
        int[] b = {10, 20, 30};
        int[] c = {10, 20, 40};

        System.out.println("===== Primitive Arrays =====");

        System.out.println("A : " + Arrays.toString(a));
        System.out.println("B : " + Arrays.toString(b));
        System.out.println("C : " + Arrays.toString(c));

        System.out.println("\nMismatch(A,B) = " + Arrays.mismatch(a, b));
        System.out.println("Mismatch(A,C) = " + Arrays.mismatch(a, c));
        // =====================================================
        // Example 2 : Compare Subarrays
        // =====================================================
        int[] p = {10, 20, 30, 40};
        int[] q = {10, 20, 50, 40};

        System.out.println("\n===== Compare Subarrays =====");

        System.out.println("P : " + Arrays.toString(p));
        System.out.println("Q : " + Arrays.toString(q));

        int result = Arrays.mismatch(
                p, 0, 2,
                q, 0, 2);

        System.out.println("Mismatch(P[0,2), Q[0,2)) = " + result);
        // =====================================================
        // Example 3 : Wrapper Arrays
        // =====================================================
        Integer[] x = {10, 20, 30};
        Integer[] y = {10, 20, 40};

        System.out.println("\n===== Wrapper Arrays =====");
        System.out.println("Mismatch = " + Arrays.mismatch(x, y));
        // =====================================================
        // Example 4 : Comparator Version (Ignore Case)
        // =====================================================
        String[] s1 = {"GeeksForGeeks", "IDE"};
        String[] s2 = {"geeksforgeeks", "Courses"};
        System.out.println("\n===== Comparator Version =====");
        int index = Arrays.mismatch(s1,s2,String::compareToIgnoreCase);
        System.out.println("Mismatch Index = " + index);
        // =====================================================
        // Example 5 : Longest Common Prefix
        // =====================================================
        int[] first = {10, 20, 30, 40, 50};
        int[] second = {10, 20, 30, 60, 70};

        int lcp = Arrays.mismatch(first, second);
        System.out.println("\n===== Longest Common Prefix =====");
        System.out.println("LCP Length = " + lcp);
    }
}