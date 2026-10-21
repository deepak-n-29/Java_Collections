import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingInJava {

    // Student class to demonstrate sorting objects
    static class Student {
        String branch;
        int rollNo;

        Student(String branch, int rollNo) {
            this.branch = branch;
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {
            return branch + " " + rollNo;
        }
    }

    public static void main(String[] args) {

        // =====================================================
        // 1. Sorting Primitive Array
        // =====================================================

        int[] numbers = {40, 10, 30, 20};

        System.out.println("1. Primitive Array");
        System.out.println("Before sorting: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("After sorting:  " + Arrays.toString(numbers));

        // =====================================================
        // 2. Sorting String Array
        // =====================================================

        String[] names = {"Rahul", "Deepak","Amit"};

        System.out.println("\n2. String Array");
        System.out.println("Before sorting: "+ Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("After sorting:  "+ Arrays.toString(names));

        // =====================================================
        // 3. Sorting ArrayList
        // =====================================================
        ArrayList<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        System.out.println("\n3. ArrayList");
        System.out.println("Before sorting: " + list);

        Collections.sort(list);
        System.out.println("After sorting:  " + list);

        // =====================================================
        // 4. Sorting LinkedList
        // =====================================================

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(50);
        linkedList.add(20);
        linkedList.add(40);
        linkedList.add(10);

        System.out.println("\n4. LinkedList");
        System.out.println("Before sorting: " + linkedList);

        Collections.sort(linkedList);
        System.out.println("After sorting:  " + linkedList); 

        // =====================================================
        // 5. Stable Sorting Example
        // =====================================================

        List<Student> students = new ArrayList<>();

        students.add(new Student("CS", 101));
        students.add(new Student("ECE", 102));
        students.add(new Student("CS", 104));
        students.add(new Student("ECE", 107));

        System.out.println("\n5. Stable Sorting Example");

        System.out.println("Before sorting:");
        System.out.println(students);

        /*
         * Sort according to branch.
         *
         * Students having the same branch should
         * retain their original relative order.
         */

        Collections.sort(students, (s1, s2) ->
                s1.branch.compareTo(s2.branch)
        );

        System.out.println("After sorting by branch:");
        System.out.println(students);
    }
}