import java.util.Arrays;

public class stringReferenceMethod {
    public static void main(String[] args) {
        String a[] = {"GFG", "IDE", "Courses"};
        String b[] = {"gfg", "ide", "courses"};

        if(Arrays.equals(a,b,String::compareToIgnoreCase))
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}
