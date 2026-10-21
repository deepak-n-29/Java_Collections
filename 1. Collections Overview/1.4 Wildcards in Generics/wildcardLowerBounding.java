import java.util.*;
class Student{}

class EnggStudent extends Student{}

public class wildcardLowerBounding {
    public static void main(String[] args) {
        ArrayList<? super Student> al1 = new ArrayList<>();  
        ArrayList<Object> al2 = new ArrayList<>();
        al1=al2;
        System.out.println("Output: " + al1);
        System.out.println("Output: " + al2);

    }
}
