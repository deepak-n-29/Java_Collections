import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class traversingDeque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(5);
        d.offerLast(15);

        System.out.println("iterator in forward");
        Iterator<Integer> it= d.iterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
        // one way of traversing deque from first to last
        System.out.println("for loop");

        for(int x:d){
            System.out.println(x + " ");
        }
        // another way of traversing deque
        
        System.out.println("iterator in reverse");

        Iterator it1= d.descendingIterator();
        while(it1.hasNext()){
            System.out.println(it1.next() + " ");
        }
        // one way of traversing deque from last to first


    }
}
