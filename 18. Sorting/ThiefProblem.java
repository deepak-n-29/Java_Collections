// The problem is simple: SUM OF K LARGEST ELEMENTS
// Given an array of item values and k, find the maximum total value the thief can collect by choosing exactly/at most k items.

// For example:
// arr = [3, 7, 2, 5, 12, 30]
// k = 3

// The 3 largest values are: 30 + 12 + 7 = 49

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class ThiefProblem {
    
    //Solution 1: Sort the array
    public static int findMaxValue(Integer[] arr, int k){ // Time Complexity: O(nlogn)
        Arrays.sort(arr, Collections.reverseOrder());
        int sum = 0;
        for(int i=0; i<k;i++){
            sum += arr[i];
        }
        return sum;
    }

    //Solution 2: Using Priority Queue and min heap
    // Min Heap of size k → keep k largest → sum them
    public static int findMaxValueUsingPriorityQueue(Integer[] arr, int k){ // Time Complexity: O(nlogk)
        
        // Min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);

            // Keep only k largest elements
            if(pq.size() > k){
                pq.poll();
            }
        }
        int sum = 0;

        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }        

    public static void main(String args[]){
        Integer[] arr = {3, 7, 2, 5, 12, 30};
        int k = 3;
        System.out.println(findMaxValue(arr, k));

        System.out.println(findMaxValueUsingPriorityQueue(arr, k));
    }
}
