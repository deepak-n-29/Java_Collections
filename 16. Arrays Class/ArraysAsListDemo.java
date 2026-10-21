import java.util.*;

public class ArraysAsListDemo {
    public static void main(String[] args) {
        // ======================================================
        // Example 1 : Convert Array to List
        // ======================================================
        String[] arr = {"GFG", "IDE", "Courses"};
        List<String> list = Arrays.asList(arr);

        System.out.println("===== Array to List =====");
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("List  : " + list);
        // ======================================================
        // Example 2 : Change Array -> List Changes
        // ======================================================
        arr[0] = "Practice";

        System.out.println("\n===== Change Array =====");
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("List  : " + list);
        // ======================================================
        // Example 3 : Change List -> Array Changes
        // ======================================================
        list.set(1, "Premium");

        System.out.println("\n===== Change List =====");
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("List  : " + list);
        // ======================================================
        // Example 4 : add() / remove()
        // ======================================================
        System.out.println("\n===== Fixed Size List =====");

        try {
            list.add("Java");
        } catch (UnsupportedOperationException e) {
            System.out.println("add() -> UnsupportedOperationException");
        }

        try {
            list.remove(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("remove() -> UnsupportedOperationException");
        }
        // ======================================================
        // Example 5 : Reverse an Array
        // (Works only for Object Arrays)
        // ======================================================
        Collections.reverse(Arrays.asList(arr));

        System.out.println("\n===== Reverse Array =====");
        System.out.println(Arrays.toString(arr));
        // ======================================================
        // Example 6 : Create HashSet
        // ======================================================
        HashSet<String> set = new HashSet<>(Arrays.asList(arr));

        System.out.println("\n===== HashSet =====");
        System.out.println(set);
        // ======================================================
        // Example 7 : Create ArrayList
        // ======================================================
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));

        System.out.println("\n===== ArrayList =====");
        System.out.println(arrayList);
        // ======================================================
        // Example 8 : Create PriorityQueue
        // ======================================================

        PriorityQueue<String> pq =
                new PriorityQueue<>(Arrays.asList(arr));

        System.out.println("\n===== PriorityQueue =====");
        System.out.println(pq);
    }
}