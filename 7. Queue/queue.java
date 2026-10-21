import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class queue{
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.isEmpty());

    }
}