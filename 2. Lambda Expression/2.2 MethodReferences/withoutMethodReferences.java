import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class withoutMethodReferences {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(10,20,15,16));
        al.forEach(i -> System.out.println(i));
    }
    
}
