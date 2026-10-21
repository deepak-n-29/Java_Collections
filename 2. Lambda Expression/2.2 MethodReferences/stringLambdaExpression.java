import java.util.Arrays;

public class stringLambdaExpression {
    public static void main(String[] args) {
        String a[] = {"GFG", "IDE", "Courses"};
        String b[] = {"gfg", "ide", "courses"};

        if(Arrays.equals(a,b,(x1,x2)->x1.compareToIgnoreCase(x2)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
