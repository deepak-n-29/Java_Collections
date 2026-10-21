import java.util.Deque;
import java.util.LinkedList;

public class deque {
    
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10);
        d.offerLast(20);
        d.offerFirst(5);
        d.offerLast(15);

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

        //these functions do not throw exceptions

        d.addFirst(11);
        d.addLast(21);
        d.addFirst(6);
        d.addLast(16);

        System.out.println(d.getFirst());
        System.out.println(d.getLast());

        System.out.println(d.removeFirst());
        System.out.println(d.removeLast());

        System.out.println(d.getFirst());
        System.out.println(d.getLast());

        //these functions throw exceptions

    }
}
