import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// This is the optimized version of Problem 91. The key idea from the lecture is to avoid Collections.sort(), which costs O(n log n), by using frequency as an array index.
// Core idea
// Suppose:
    // arr = {10, 5, 20, 10, 10, 5, 30}
    // First count frequencies:
    // 10 → 3
    // 5  → 2
    // 20 → 1
    // 30 → 1

// The maximum possible frequency is n, because no element can occur more than n times. So we create buckets indexed by frequency:
    // frequency[1] → 20, 30
    // frequency[2] → 5
    // frequency[3] → 10

// Then traverse from highest frequency to lowest:
    // 3 → 10 → 10 10 10
    // 2 → 5  → 5 5
    // 1 → 20, 30 → 20 30

public class sortElementsByFrequencyInLinearTime { // Time Complexity: O(n)
    void sortByFrequency(int arr[]) {
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>(); // Step 1: Create HashMap and store frequencies ex: {10:4, 5:2, 20:2}
        
        for(int i =0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }
        //Step 2: Convert HashMap to List 
        List<List<Integer>> freq = new ArrayList<>();
        
        //step 2.1: Initialize n+1 buckets
        for(int i=0; i<=n;i++){
            freq.add(new ArrayList<>());
        }

        //Step 2.2: Put elements in buckets
        // for(Map.Entry<Integer, Integer> e: map.entrySet()){
        //     freq.get(e.getValue()).add(e.getKey());
        // }

        //Step 2.2: Put elements in buckets with maintaining order
        for(int i=0;i<n;i++){
            int f = map.get(arr[i]); // get frequency
            if(f!=-1){
                freq.get(f).add(arr[i]);
                map.put(arr[i], -1);
            }
        }

        //Step 3: Put elements in original array
        int index = 0;
        for(int i=n;i>=0;i--){
            for(int x: freq.get(i)){
                for(int j=0;j<i;j++){
                    arr[index++] = x;
                }
            }
        }
    }    

    public static void main(String[] args){
        int[] arr = {10, 5, 20, 5, 10, 10, 20};
        sortElementsByFrequencyInLinearTime obj = new sortElementsByFrequencyInLinearTime();
        obj.sortByFrequency(arr);
    }
}
