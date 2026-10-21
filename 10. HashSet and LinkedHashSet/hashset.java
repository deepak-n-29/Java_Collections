import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset{
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("D");
        System.out.println(set);

        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(2);

        System.out.println(set1);

        System.out.println(set1.contains(2));

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(set1.size());

        System.out.println(set1.remove(set1.toArray()[3]));
        System.out.println(set1);

        set1.clear();
        System.out.println(set1);
    }
}