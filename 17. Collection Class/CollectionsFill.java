import java.util.ArrayList;
import java.util.Collections;

public class CollectionsFill {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        Collections.fill(list, 5);
        System.out.println(list);
    }    

}
