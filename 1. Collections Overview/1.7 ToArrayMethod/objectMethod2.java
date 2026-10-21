import java.util.ArrayList;
import java.util.List;

public class objectMethod2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Integer[] arr = list.toArray(new Integer[0]);
        // new Integer[0] is the size of the array. the size of the array is inferred from the size of the list. suppose if there are 4 elements in the list then the size of the array will be 4
        for(Integer x : arr){
            System.out.println(x);
        }
    }
}
