import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class usingLambdaExpression {
    
    static void printCond(Collection<Integer> c, Predicate<Integer> p) {
        for(Integer i : c) {
            if(p.test(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(10, 4, 3, 7, 30));
        printCond(al, i -> i % 2 == 0);
    }   
}
