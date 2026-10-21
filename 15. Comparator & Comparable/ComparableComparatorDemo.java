import java.util.*;

class Student implements Comparable<Student> {

    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Natural Ordering (Roll Number)
    @Override
    public int compareTo(Student other) {
        return this.rollNo - other.rollNo;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}

public class ComparableComparatorDemo {

    public static void main(String[] args) {

        Student[] students = {
                new Student(3,"Raj",75),
                new Student(1,"Amit",90),
                new Student(5,"John",65),
                new Student(2,"Riya",95)
        };

        // Comparable (Natural Order)
        Arrays.sort(students);

        System.out.println("Sort by Roll Number");
        for(Student s:students)
            System.out.println(s);

        // Comparator using Lambda (Marks)
        Arrays.sort(students, (a,b)->a.marks-b.marks);

        System.out.println("\nSort by Marks");
        for(Student s:students)
            System.out.println(s);

        // Comparator using Lambda (Name)
        Arrays.sort(students,(a,b)->a.name.compareTo(b.name));

        System.out.println("\nSort by Name");
        for(Student s:students)
            System.out.println(s);

        // Reverse Order (Comparable)
        Arrays.sort(students, Collections.reverseOrder());

        System.out.println("\nReverse Roll Number");
        for(Student s:students)
            System.out.println(s);

        // PriorityQueue using Comparator
        PriorityQueue<Student> pq = new PriorityQueue<>((a,b)->a.marks-b.marks);

        pq.addAll(Arrays.asList(students));

        System.out.println("\nPriority Queue (Marks)");
        while(!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
