import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class objectMethod1 {

    public static void main(String[] args) {
        // Queue<Integer> q = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Object[] arr = list.toArray();
        for(Object x : arr){
            System.out.println(x);
        }

    }

    
}
