import java.util.Arrays;
import java.util.Comparator;

/*
 * ============================================================
 * ComparatorMethods.java
 * ============================================================
 *
 * Java 8 Comparator Utility Methods
 *
 * 1. compare()          -> Only abstract method (must implement)
 * 2. comparing()
 * 3. thenComparing()
 * 4. naturalOrder()
 * 5. reverseOrder()
 * 6. reversed()
 * 7. nullsFirst()
 * 8. nullsLast()
 *
 * ============================================================
 */

class Student {

    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Key Extractor
    public String getName() {
        return name;
    }

    // Key Extractor
    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "(" + name + ", " + rollNo + ")";
    }
}

public class ComparatorMethods {
    public static void main(String[] args) {
        // ====================================================
        // 1. compare() (Manual Comparator)
        // ====================================================
        System.out.println("===== compare() =====");
        Integer[] nums1 = {40, 10, 30, 20};

        Arrays.sort(nums1, new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {
                // Ascending Order
                return Integer.compare(a, b);
            }
        });
        System.out.println(Arrays.toString(nums1));
        // ====================================================
        // 2. comparing()
        // ====================================================
        System.out.println("\n===== comparing() =====");

        Student[] students1 = {
                new Student("XYZ",110),
                new Student("ABC",120),
                new Student("ABC",101)
        };

        Arrays.sort(students1,Comparator.comparing(Student::getName));
        System.out.println(Arrays.toString(students1));
        // ====================================================
        // 3. thenComparing()
        // ====================================================
        System.out.println("\n===== thenComparing() =====");
        Student[] students2 = {
                new Student("XYZ",110),
                new Student("ABC",120),
                new Student("ABC",101)
        };
        Arrays.sort(students2,Comparator.comparing(Student::getName)
                          .thenComparing(Student::getRollNo));

        System.out.println(Arrays.toString(students2));
        // ====================================================
        // 4. naturalOrder()
        // ====================================================
        System.out.println("\n===== naturalOrder() =====");
        String[] words1 = {"GFG","Course","IDE"};

        Arrays.sort(words1, Comparator.naturalOrder());
        System.out.println(Arrays.toString(words1));
        // ====================================================
        // 5. reverseOrder()
        // ====================================================
        System.out.println("\n===== reverseOrder() =====");
        String[] words2 = {"GFG","Course","IDE"};

        Arrays.sort(words2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(words2));
        // ====================================================
        // 6. reversed()
        // Reverse an existing comparator
        // ====================================================
        System.out.println("\n===== reversed() =====");

        Student[] students3 = {
                new Student("XYZ",110),
                new Student("ABC",120),
                new Student("ABC",101)
        };

        Comparator<Student> cmp =Comparator.comparing(Student::getName)
                                    .thenComparing(Student::getRollNo);

        Arrays.sort(students3, cmp.reversed());
        System.out.println(Arrays.toString(students3));
        // ====================================================
        // 7. nullsFirst()
        // ====================================================
        System.out.println("\n===== nullsFirst() =====");
        String[] arr1 = {"GFG",null,"IDE",null};

        Arrays.sort(arr1,Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(arr1));
        // ====================================================
        // 8. nullsLast()
        // ====================================================
        System.out.println("\n===== nullsLast() =====");
        String[] arr2 = {"GFG",null,"IDE",null};

        Arrays.sort(arr2,Comparator.nullsLast(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(arr2));
        // ====================================================
        // BONUS
        // Ignore Case Sorting (Method Reference)
        // ====================================================
        System.out.println("\n===== compareToIgnoreCase() =====");
        String[] names = {"gfg","IDE","GFG","Course"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}