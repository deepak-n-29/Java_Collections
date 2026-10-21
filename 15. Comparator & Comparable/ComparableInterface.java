import java.util.*;

/*
 * ComparableInterface.java
 *
 * Comparable defines the NATURAL ORDERING of objects.
 *
 * A class implements Comparable<T> and overrides compareTo().
 *
 * compareTo() returns:
 *      Negative -> Current object is smaller
 *      Zero     -> Both objects are equal
 *      Positive -> Current object is greater
 *
 * Once Comparable is implemented, Java can automatically use it in:
 *
 * 1. Arrays.sort()
 * 2. Collections.sort()
 * 3. TreeSet
 * 4. TreeMap
 * 5. PriorityQueue
 * 6. Binary Search
 *
 * without providing any Comparator.
 */

class StudentComparable implements Comparable<StudentComparable> {

    int rollNo;
    String name;

    StudentComparable(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    /*
     * Natural Ordering
     *
     * Sort StudentComparables according to Roll Number
     */
    @Override
    public int compareTo(StudentComparable other) {

        /*
         * this.rollNo < other.rollNo -> Negative
         * this.rollNo == other.rollNo -> Zero
         * this.rollNo > other.rollNo -> Positive
         */

        return this.rollNo - other.rollNo;

        // Better (avoids integer overflow)
        // return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "(" + rollNo + ", " + name + ")";
    }
}

public class ComparableInterface {

    public static void main(String[] args) {

        StudentComparable[] StudentComparables = {
                new StudentComparable(103, "Rahul"),
                new StudentComparable(101, "Amit"),
                new StudentComparable(105, "John"),
                new StudentComparable(102, "Neha"),
                new StudentComparable(104, "David")
        };

        //---------------------------------------------------------
        // Original Array
        //---------------------------------------------------------
        System.out.println();

        System.out.println("Original Array");
        System.out.println(Arrays.toString(StudentComparables));

        //---------------------------------------------------------
        // Arrays.sort() -> Uses compareTo()
        //---------------------------------------------------------
        Arrays.sort(StudentComparables);

        System.out.println("\nSorted (Natural Order - Roll Number)");
        System.out.println(Arrays.toString(StudentComparables));

        //---------------------------------------------------------
        // Reverse Order
        //---------------------------------------------------------
        Arrays.sort(StudentComparables, Collections.reverseOrder());

        System.out.println("\nReverse Order");
        System.out.println(Arrays.toString(StudentComparables));

        //---------------------------------------------------------
        // TreeSet
        //---------------------------------------------------------
        TreeSet<StudentComparable> treeSet = new TreeSet<>();

        treeSet.add(new StudentComparable(3, "Riya"));
        treeSet.add(new StudentComparable(1, "Ankit"));
        treeSet.add(new StudentComparable(5, "John"));
        treeSet.add(new StudentComparable(2, "David"));
        treeSet.add(new StudentComparable(4, "Alex"));

        System.out.println("\nTreeSet (Automatically Sorted)");
        System.out.println(treeSet);

        //---------------------------------------------------------
        // TreeSet Reverse Order
        //---------------------------------------------------------
        TreeSet<StudentComparable> reverseTree = new TreeSet<>(Collections.reverseOrder());

        reverseTree.addAll(treeSet);

        System.out.println("\nTreeSet Reverse Order");
        System.out.println(reverseTree);

        //---------------------------------------------------------
        // PriorityQueue (Min Heap)
        //---------------------------------------------------------
        PriorityQueue<StudentComparable> minHeap = new PriorityQueue<>();

        minHeap.add(new StudentComparable(4, "D"));
        minHeap.add(new StudentComparable(1, "A"));
        minHeap.add(new StudentComparable(5, "E"));
        minHeap.add(new StudentComparable(2, "B"));
        minHeap.add(new StudentComparable(3, "C"));

        System.out.println("\nPriorityQueue (Min Heap)");

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

        //---------------------------------------------------------
        // PriorityQueue (Max Heap)
        //---------------------------------------------------------
        PriorityQueue<StudentComparable> maxHeap =  new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(new StudentComparable(4, "D"));
        maxHeap.add(new StudentComparable(1, "A"));
        maxHeap.add(new StudentComparable(5, "E"));
        maxHeap.add(new StudentComparable(2, "B"));
        maxHeap.add(new StudentComparable(3, "C"));
    

        System.out.println("\nPriorityQueue (Max Heap)");

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }

        //---------------------------------------------------------
        // Binary Search
        //---------------------------------------------------------
        StudentComparable[] searchArray = {
                new StudentComparable(1, "A"),
                new StudentComparable(2, "B"),
                new StudentComparable(3, "C"),
                new StudentComparable(4, "D"),
                new StudentComparable(5, "E")
        };

        // Array MUST be sorted before Binary Search
        Arrays.sort(searchArray);

        int index = Arrays.binarySearch(
                searchArray,
                new StudentComparable(3, "Anything")
        );

        System.out.println("\nBinary Search");
        System.out.println("Roll No 3 found at index : " + index);
    }
}