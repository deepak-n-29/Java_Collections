import java.util.*;

public class CollectionsClass {

    public static void main(String[] args) {

        // =========================================================
        // 1. SORT
        // =========================================================

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 30, 20, 15));
        System.out.println("Original list       : " + numbers);
        // Sorts the list in natural/increasing order
        Collections.sort(numbers);

        System.out.println("After sort          : " + numbers);

        // =========================================================
        // 2. REVERSE
        // =========================================================
        // Reverses the existing list
        Collections.reverse(numbers);
        System.out.println("After reverse       : " + numbers);
        // =========================================================
        // 3. MIN
        // =========================================================
        // Finds the minimum element
        int min = Collections.min(numbers);
        System.out.println("Minimum             : " + min);
        // =========================================================
        // 4. MAX
        // =========================================================
        // Finds the maximum element
        int max = Collections.max(numbers);
        System.out.println("Maximum             : " + max);
        // =========================================================
        // 5. FREQUENCY
        // =========================================================
        // Add duplicate values
        numbers.add(10);
        numbers.add(10);

        // Counts how many times 10 occurs
        int frequency = Collections.frequency(numbers, 10);
        System.out.println("Frequency of 10     : " + frequency);
        // =========================================================
        // 6. DISJOINT
        // =========================================================
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(40, 50, 60);

        // true -> no common elements
        boolean disjoint = Collections.disjoint(list1, list2);
        System.out.println("Lists are disjoint  : " + disjoint);

        // If there is a common element
        List<Integer> list3 = Arrays.asList(30, 40, 50);
        boolean notDisjoint = Collections.disjoint(list1, list3);
        System.out.println("Lists are disjoint  : " + notDisjoint);
        // =========================================================
        // 7. BINARY SEARCH
        // =========================================================
        // IMPORTANT:
        // List must already be sorted before binarySearch()
        List<Integer> sortedList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int index = Collections.binarySearch(sortedList, 30);
        System.out.println("Index of 30         : " + index);
        // =========================================================
        // 8. FILL
        // =========================================================
        List<Integer> fillList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // Replaces every element with 100
        Collections.fill(fillList, 100);
        System.out.println("After fill          : " + fillList);
        // =========================================================
        // 9. SWAP
        // =========================================================

        List<Integer> swapList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        // Swap elements at index 0 and index 3
        Collections.swap(swapList, 0, 3);
        System.out.println("After swap          : " + swapList);

        // =========================================================
        // 10. ROTATE
        // =========================================================

        List<Integer> rotateList = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        // Rotate the list by 3 positions
        Collections.rotate(rotateList, 3);
        System.out.println("After rotate        : " + rotateList);

        // =========================================================
        // 11. REPLACE ALL
        // =========================================================

        List<Integer> replaceList = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 10));

        // Replace every 10 with 99
        Collections.replaceAll(replaceList, 10, 99);
        System.out.println("After replaceAll    : " + replaceList);

        // =========================================================
        // 12. COPY
        // =========================================================

        List<Integer> source = Arrays.asList( 10, 20, 30);

        // Destination must have enough size.
        List<Integer> destination = new ArrayList<>(Arrays.asList(0, 0, 0));

        // Copies source elements into destination
        Collections.copy(destination, source);

        System.out.println("Source              : " + source);
        System.out.println("Destination         : " + destination);

        // =========================================================
        // 13. INDEX OF SUBLIST
        // =========================================================

        List<Integer> mainList = Arrays.asList(10, 20, 30, 40, 50, 30, 40);
        List<Integer> target = Arrays.asList(30, 40);

        // Finds first occurrence of target sublist
        int firstIndex =  Collections.indexOfSubList(mainList, target);

        System.out.println("First sublist index : " + firstIndex);


        // =========================================================
        // 14. LAST INDEX OF SUBLIST
        // =========================================================

        // Finds last occurrence of target sublist
        int lastIndex = Collections.lastIndexOfSubList(mainList, target);
        System.out.println("Last sublist index  : " + lastIndex);

        // =========================================================
        // 15. SORT IN DESCENDING ORDER
        // =========================================================

        List<Integer> descending = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // reverseOrder() gives a comparator
        // that reverses natural ordering
        Collections.sort(descending,Collections.reverseOrder());
        System.out.println("Descending order    : " + descending);

        // =========================================================
        // 16. REVERSE ORDER COMPARATOR
        // =========================================================
        Comparator<Integer> reverseComparator =Collections.reverseOrder();
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(5, 10, 15, 20));

        Collections.sort(numbers2, reverseComparator);
        System.out.println("Reverse comparator  : " + numbers2);

        // =========================================================
        // 17. SYNCHRONIZED LIST
        // =========================================================
        List<Integer> normalList = new ArrayList<>(Arrays.asList(10, 20, 30));
        // Creates a thread-safe wrapper around the list
        List<Integer> synchronizedList = Collections.synchronizedList(normalList);
        System.out.println("Synchronized list  : " + synchronizedList);

        // =========================================================
        // 18. SYNCHRONIZED SET
        // =========================================================

        Set<Integer> normalSet = new HashSet<>(Arrays.asList(10, 20, 30));

        // Creates a synchronized/thread-safe wrapper
        Set<Integer> synchronizedSet = Collections.synchronizedSet(normalSet);
        System.out.println("Synchronized set   : " + synchronizedSet);

        // =========================================================
        // 19. SYNCHRONIZED MAP
        // =========================================================

        Map<Integer, String> normalMap = new HashMap<>();

        normalMap.put(1, "Java");
        normalMap.put(2, "Spring Boot");

        // Creates a synchronized/thread-safe wrapper
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(normalMap);
        System.out.println("Synchronized map   : " + synchronizedMap);

        // =========================================================
        // 20. UNMODIFIABLE LIST
        // =========================================================

        List<Integer> originalList = new ArrayList<>(Arrays.asList(10, 20, 30));

        // Creates an unmodifiable view
        List<Integer> unmodifiableList = Collections.unmodifiableList(originalList);

        System.out.println("Unmodifiable list  : " + unmodifiableList);

        // This will throw:
        // UnsupportedOperationException
        // unmodifiableList.add(40);

        // =========================================================
        // 21. UNMODIFIABLE SET
        // =========================================================
        Set<Integer> originalSet = new HashSet<>(Arrays.asList(10, 20, 30));
        Set<Integer> unmodifiableSet = Collections.unmodifiableSet(originalSet);

        System.out.println("Unmodifiable set   : " + unmodifiableSet);

        // This will throw:
        // unmodifiableSet.add(40);

        // =========================================================
        // 22. UNMODIFIABLE MAP
        // =========================================================

        Map<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Java");
        originalMap.put(2, "Spring");

        Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(originalMap);
        System.out.println("Unmodifiable map   : " + unmodifiableMap);

        // This will throw:
        // UnsupportedOperationException

        // unmodifiableMap.put(3, "Hibernate");

        // =========================================================
        // FINAL SUMMARY
        // =========================================================

        System.out.println("\n======================================");
        System.out.println(" Collections Class Revision Complete ");
        System.out.println("======================================");

        /*
         * IMPORTANT METHODS TO REMEMBER:
         *
         * Collections.sort()
         * Collections.reverse()
         * Collections.min()
         * Collections.max()
         * Collections.frequency()
         * Collections.disjoint()
         * Collections.binarySearch()
         * Collections.copy()
         * Collections.fill()
         * Collections.indexOfSubList()
         * Collections.lastIndexOfSubList()
         * Collections.replaceAll()
         * Collections.rotate()
         * Collections.swap()
         * Collections.reverseOrder()
         *
         * Collections.synchronizedList()
         * Collections.synchronizedSet()
         * Collections.synchronizedMap()
         *
         * Collections.unmodifiableList()
         * Collections.unmodifiableSet()
         * Collections.unmodifiableMap()
         */
    }
}