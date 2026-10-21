import java.util.Arrays;

class student{
    int rollno;
    int marks;
    student(int rollno, int marks){
        this.marks = marks;
        this.rollno = rollno;
    }
}
public class SortStudentsByMarks {
    
    public void SortByMarks(int rollno[], int marks[]){
        int n = rollno.length;
        student[] arr = new student[n];
        for(int i=0;i<n;i++){
            arr[i] = new student(rollno[i], marks[i]);
        }
        Arrays.sort(arr, (s1,s2)->s2.marks - s1.marks);
        for(int i=0;i<n;i++){
            System.out.println(arr[i].rollno + " " + arr[i].marks);
        }
    }

    public static void main(String[] args){
        int rollno[] = {101, 103, 105};
        int marks[] = {80, 70, 90};
        SortStudentsByMarks obj = new SortStudentsByMarks();
        obj.SortByMarks(rollno, marks);
    }
}
