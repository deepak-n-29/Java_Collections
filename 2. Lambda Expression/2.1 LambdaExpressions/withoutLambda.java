import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class withoutLambda {
    static void printCond(Collection<Integer> c, Predicate<Integer> p) {
        for (Integer i : c) {
            if (p.test(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        class MyPredicateEven implements Predicate<Integer> {
            public boolean test(Integer i) {
                return i % 2 == 0;
            }
        }

        List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
        printCond(al, new MyPredicateEven());
    }
}
