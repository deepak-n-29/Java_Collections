import java.util.ArrayList;
import java.util.List;

public class containsAll {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        System.out.println("Output: " + list1.containsAll(list2));
    }
}
