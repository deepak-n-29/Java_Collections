import java.util.Arrays;
import java.util.List;

public class forEachLoop {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,4,30,40);
        for(Integer x : list){
            System.out.println(x);
        }
    }
}
     