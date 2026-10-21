import java.util.ArrayDeque;

public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        
        System.out.println(ad);

        ad.push(40);
        ad.push(50);
        System.out.println(ad.peek());
        System.out.println(ad.pop());
        System.out.println(ad.peek());

        ad.offer(60);
        ad.offer(70);
        System.out.println(ad.peek());
        System.out.println(ad.poll());
        System.out.println(ad.peek());

        ad.offer(80);
        System.out.println(ad.peek());

        ad.offerFirst(90);
        ad.offerLast(100);
        ad.offerFirst(110);
        ad.offerLast(120);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

    }
}
