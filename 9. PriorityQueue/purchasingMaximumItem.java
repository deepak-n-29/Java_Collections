//I/P: cost [] = {1, 12, 5, 111, 200} sum = 10
//O/P: 2 // 1+5

//I/P: cost [] = {20,10,5,30,100} sum=35
//O/P: 3 // 20+10+5=35

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class purchasingMaximumItem {
    
    static int purchaseMax(List<Integer> arr, int sum){ // T.C: O(nlogn)
        PriorityQueue<Integer> pq = new PriorityQueue<>(arr);
        int count = 0; 
        while(sum>=0 && !pq.isEmpty() && pq.peek()<=sum){
            sum = sum - pq.poll();
            count++;
        }
        return count;
    }
    static int purchaseMinGreedy(int[] cost, int sum){ // T.C: O(nlogn)
        // sorting + greedy: "Yes, I'll sort the array first and then greedily purchase items from the smallest cost onwards."
        Arrays.sort(cost);
        int count=0;
        // for(int i=0;i<cost.length;i++){
        //     if(cost[i]<=sum){
        //         sum = sum - cost[i];
        //         count++;
        //     }
        // }
        for(int price: cost){
            if(price>sum){
                break;
            }
            sum = sum - price;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Integer arr[] = {1,12,5,111,200};
        List<Integer> list = List.of(arr);
        int sum = 10;
        System.out.println(purchaseMax(list,sum));
        
        int arr1[] = {1,12,5,111,200};
        System.out.println(purchaseMinGreedy(arr1,sum));
    }
}
