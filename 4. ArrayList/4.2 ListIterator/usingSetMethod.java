import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class usingSetMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ListIterator<Integer> it = list.listIterator(list.size());

        while(it.hasPrevious())
        {
            int x = it.previous();
            it.set(x*2);
        }
        System.out.println(list);
    }

}
