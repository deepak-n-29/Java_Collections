// I/P: q = {10,20,30,40,50}
// k=3
// O/P: q = {30, 20, 10, 40, 50}


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class reverseFirstKitems {
    void reverseK(Queue<Integer> q, int k) {
        if(q.size()<0 || k<=0) return; 

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<k;i++){
            stack.push(q.poll());
        }

        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }

        for(int i=0;i<q.size()-k;i++){
            q.offer(q.poll());
        }
    }

    public static void main(String[] args) {
             // Queue<Integer> q = new LinkedList<Integer>(); 
        Queue<Integer> q = new ArrayDeque<Integer>(); 
        
        q.offer(10); 
        q.offer(20); 
        q.offer(30); 
        q.offer(40);
        q.offer(50);
       
       int k=3;
       
       new reverseFirstKitems().reverseK(q,k); // or make function as static
       
       System.out.println(q);

    }
}
