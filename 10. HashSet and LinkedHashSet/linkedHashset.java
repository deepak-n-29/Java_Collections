import java.util.LinkedHashSet;

public class linkedHashset {
   public static void main(String[] args) {
       LinkedHashSet<String> set = new LinkedHashSet<String>();
       set.add("A");
       set.add("B");
       set.add("C");
       set.add("D");
       set.add("E");
       set.add("D");

       for(String s : set){
           System.out.println(s);
       }
       System.out.println(set);

       LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
       set1.add(1);
       set1.add(2);
       set1.add(3);
       set1.add(4);
       set1.add(5);
       set1.add(2);

       System.out.println(set1);


   } 
}
