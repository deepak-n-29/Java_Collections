import java.util.ArrayList;
import java.util.List;

public class removeIf {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(15);
        list1.add(30);
        list1.add(19);
        list1.removeIf((n) -> n%2==0);

        System.out.println(list1);
    }
}
