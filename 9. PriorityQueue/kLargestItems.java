import java.util.Collections;
import java.util.PriorityQueue;

// example: arr = [1, 23, 12, 9, 30, 2, 50], k = 3
// output: [30, 23, 50]
// working: 
    // add the first k elements to the min heap, 
    // then check if the current element is greater than the smallest element in the heap, 
    // if it is, remove the smallest element and add the current element
public class kLargestItems{

    static void printKLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        // PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder()); // max heap

        for(int i=0;i<k;i++) 
            pq.add(arr[i]); // adding the first k elements

        for(int i=k;i<arr.length;i++){
            if(arr[i]>pq.peek()){
                pq.poll();         // if the current element is greater than the smallest element, 
                pq.add(arr[i]);    // remove the smallest element and add the current element
            }
        }

        for(int i=0;i<k;i++){
            System.out.println(pq.poll()); // the remaining elements are the k largest
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;
        printKLargest(arr,k);
    }
}