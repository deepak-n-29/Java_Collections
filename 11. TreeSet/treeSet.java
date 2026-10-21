import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args){
        TreeSet<String> set = new TreeSet<>();
        set.add("gfg");
        set.add("courses");
        set.add("ide");
        System.out.println(set);

        System.out.println(set.contains("ide"));

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(5);
        set1.add(2);
        set1.add(15);
        set1.remove(15);
        
        for(int i : set1){
            System.out.println(i);
        }

        TreeSet<Integer> set2 = new TreeSet<>(set1);
        set2.add(10);
        set2.add(5);
        set2.add(2);
        set2.add(15);
        System.out.println(set2.lower(5));
        System.out.println(set2.higher(5));
        System.out.println(set2.floor(5));
        System.out.println(set2.ceiling(5));
    }
}
