import java.util.Arrays;

class Student{
    int rollNo;
    String name;
    int marks;
    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
}
public class marksAverage {
    public static void main(String[] args) {
        Student arr[] = {
            new Student(110,"A",70),
            new Student(101,"B",80),
            new Student(120,"C",60),
        };
        double avg = Arrays.stream(arr)
                    .mapToInt(x->x.getMarks())
                    .average()
                    .getAsDouble();

        System.out.println(avg);
    }
}
