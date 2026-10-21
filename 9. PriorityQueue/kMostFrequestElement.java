// Problem Statement
    // Given an array where elements may repeat, print the K most frequent elements.
// Tie Rule
    // If two elements have the same frequency, the smaller value gets higher priority.

// i/p: [10,5,20,5,10,10,30] k=2
// o/p: [10,5], reason: 10:3, 5:2 

// i/p: [20.40,30,20,30,40,60,60] k=3
// o/p: [20,30,40], reason: 20:2, 30:2, 40:2, why not 60:2? coz smaller value gets higher priority

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class kMostFrequestElement {
    static class myComparator implements Comparator<Map.Entry<Integer, Integer>> { 
        public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2){
            if(m1.getValue() == m2.getValue()){ // if frequency is same, then smaller value gets higher priority. here values are the frequency and keys are the elements
                return m1.getKey() - m2.getKey(); // m1 - m2 gives increasing order i.e. smaller value gets higher priority ex: 5-10 = -5
            }else{
                return m2.getValue() - m1.getValue(); // m2 - m1 gives decreasing order i.e. higher value gets higher priority ex: 10-5 = 5
            }
        }
    }
    // method 1 (using HashMap and ArrayList)
    static void printKMostFrequent(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); // adds the frequency of each element in the map with key as element and value as frequency
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new myComparator());

        for(int i=0;i<k;i++){
            System.out.println("Key: "+list.get(i).getKey() +" value: "+list.get(i).getValue());
        }
    }

    // method 2 (using HashMap and PriorityQueue)
    static void printKMostFrequent2(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1); // adds the frequency of each element in the map with key as element and value as frequency
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new myComparator());

        pq.addAll(map.entrySet());

        
        for(int i=0;i<k;i++){
            int key = pq.peek().getKey();
            int value = pq.peek().getValue();
            pq.poll();
            System.out.println("Key: "+key +" value: "+value);
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {10,5,20,5,10,10,30};
        int k = 2;
        printKMostFrequent(arr,k);
        
        System.out.println("------------------------------------------------");
        int arr1[] = {20,40,30,20,30,40,60};
        int k1 = 2;
        printKMostFrequent2(arr1,k1);
    }
}
