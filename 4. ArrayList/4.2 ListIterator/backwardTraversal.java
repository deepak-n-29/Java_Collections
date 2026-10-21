import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class backwardTraversal {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ListIterator<Integer> it = list.listIterator(list.size());
        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }
    }
    
}
