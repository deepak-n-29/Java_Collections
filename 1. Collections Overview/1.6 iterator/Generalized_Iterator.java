import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Generalized_Iterator {
    
    static void removeEven(Collection<?> c){
        Iterator<?> it = c.iterator();
        while (it.hasNext()) {
            if((Integer)it.next() % 2 == 0)
                it.remove();
        }
        
    }
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(10);
        c.add(15);
        c.add(30);
        c.add(35);
        removeEven(c);
        System.out.println("Output: " + c);

    }
}
