import java.util.Arrays;
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
public class collectMethod {
    
    public static void main(String[] args) {
        Student arr[] = {
            new Student(110,"A",70),
            new Student(101,"B",80),
            new Student(120,"C",60),
        };

        Map<Integer,String> map = Arrays.stream(arr)
                                  .collect(Collectors.toMap(Student::getRollNo, Student::getName));  
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
