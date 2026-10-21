import java.util.ArrayList;
public class otherMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(40);

        System.out.println(list.get(1));
        list.set(1,40);

        System.out.println(list.get(1));
        System.out.println(list.indexOf(10));
        System.out.println(list.lastIndexOf(10));
        System.out.println(list.size());
        System.out.println(list);
        
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());

    }
}
