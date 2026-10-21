import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
public class collectMethod_grpBy {
    
    public static void main(String[] args) {
        Student arr[] = {
            new Student(110,"A",70),
            new Student(101,"B",80),
            new Student(120,"C",60),
        };
        Map<Integer, List<Student>> map = Arrays.stream(arr)
                              .collect(Collectors.groupingBy(Student::getMarks));  

        for(Map.Entry<Integer,List<Student>> entry : map.entrySet()){
            List<Student> list = entry.getValue();
            System.out.print(entry.getKey() + ": ");
            
            list.stream()
                .forEach(x->System.out.print("{" + x.getRollNo() + "," + x.getName() + "," + x.getMarks() + "}"));

            System.out.println();
        }
    }
}
