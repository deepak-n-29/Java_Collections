// I/P: [10,5,8,20,30,8]
// O/P: 2 5 3 1 0 3

// I/P:[50,4,8,10]
// O/P: 0 3 2 1

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class countGreaterElement {
    
    public void countGreaterElementNaive(int[] arr, int n) {  //O(n^2)
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(i!=j && arr[j]>arr[i]){
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }

    public void countGreaterElementTreeMap(int[] arr) {  
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int x: arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int cumFreq = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int freq = entry.getValue();
            map.put(entry.getKey(), cumFreq);
            cumFreq += freq;  
        }
        
        for(int x: arr){
            System.out.print(map.get(x)+" ");
        }
    }

    public static void main(String[] args) {
        countGreaterElement obj = new countGreaterElement();
        int[] arr = {1, 3, 2, 4, 5};
        int n = arr.length;
        obj.countGreaterElementNaive(arr, n);
        System.out.println();
        obj.countGreaterElementTreeMap(arr);
    }
}
