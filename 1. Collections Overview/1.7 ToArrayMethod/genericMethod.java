import java.util.ArrayList;
import java.util.List;

public class genericMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Integer[] arr = new Integer[list.size()];
        // array size is inferred from the size of the list and not the size of the array
        arr = list.toArray(arr);
        for(Integer x : arr){
            System.out.println(x);
        }
    }
}
