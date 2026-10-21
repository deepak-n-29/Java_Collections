import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
public class usingNextIndexAndPreviousIndex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        ListIterator<Integer> it = list.listIterator(2);
    
        System.out.println(it.previousIndex());
        System.out.println(it.nextIndex());
    }
}
