import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class staticMethodReferences {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(10,20,15,16));
        al.forEach(staticMethodReferences::printSquare);
    }
    public static void printSquare(Integer i) {
        System.out.println(i*i);
    }
}
