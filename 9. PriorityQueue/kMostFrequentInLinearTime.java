// I/P: {10,5,20,5,10,10,30} k=2
// m = {{10,3},{5,2},{20,1},{30,1}} and freq = {{}, {20,30}, {5}, {10}, {}, {}, {}}
// O/P: 10,5

// I/P: {6,7,6,7,6,7,4,4,2,2,5} k=3
// m = {{6,3}, {7,3}, {4,2}, {2,2}, {5,1}} and freq = {{}, {5}, {4,2}, {6,7}, {}, {}, {}, {}, {}, {}}
// O/P: 6,7,4 or 7,6,4 or 6,7,2 or 7,6,2

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kMostFrequentInLinearTime {
    // method 1 (using HashMap and ArrayList)
    static void kTopFreq(int[] arr, int k){
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        List<List<Integer>> freq = new ArrayList<List<Integer>>();
        for(int i=0;i<=n;i++){
            freq.add(new ArrayList<Integer>()); // initializing the list of lists with empty lists of size 0
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            freq.get(entry.getValue()).add(entry.getKey());     // adding the elements to the list of lists
        }

        int count = 0;
        for(int i=n; i>=0; i--){            // printing the k most frequent elements
            for(int x: freq.get(i)){        // traversing the list of lists
                if(count==k){              
                    return;
                }
                System.out.print(x+" ");
                count++;
            }
        }
    }

    // method 2 : modify method 1 to print first appearance is left most
    static void kTopFreq2(int[] arr, int k){
        int n =arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1); // adds the frequency of each element in the map with key as element and value as frequency
        }

        List<List<Integer>> freq = new ArrayList<List<Integer>>();
        for(int i=0;i<=n;i++){
            freq.add(new ArrayList<Integer>());  // initializing the list of lists with empty lists of size 0
        }

        for(int i = 0;i<n;i++){
            int f = map.get(arr[i]);
            if(f!=-1){
                freq.get(f).add(arr[i]);
                map.put(arr[i],-1);
            }
        }

        int count = 0;
        for(int i=n;i>=0;i--){
            for(int x: freq.get(i)){
                if(count==k){
                    return;
                }
                System.out.print(x+" ");
                count++;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,7,6,7,6,7,4,4,2,2,5};
        int arr1[] = {10,5,20,5,10,10,30};
        kTopFreq(arr, 3);
        System.out.println("------------------------------------------------");
        kTopFreq(arr1, 2);

        System.out.println("------------------------------------------------");
        kTopFreq2(arr, 3);
        System.out.println("------------------------------------------------");
        kTopFreq2(arr1, 2);
    }
}
