import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//i/o -> 10,20,20,10,30,30,30
//o/p -> 10 2
//       20 2
//       30 3

public class printFrequencyInOrder {
    
    static void printFrequencyHashmap(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) +1);
        }

        for(int i=0;i<arr.length;i++){
            int freq = map.get(arr[i]);
            if(freq!=-1){
                System.out.println(arr[i] + " " + freq);
                map.put(arr[i], -1);
            }
        }
    }

    static void printFrequencyLinkedHashmap(int arr[]){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) +1);
        }

        for(Map.Entry<Integer,Integer> x: map.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
    public static void main(String arg[]){
        
        int arr[] = {10,20,20,10,30,30,30};
        printFrequencyHashmap(arr);
        System.out.println();
        printFrequencyLinkedHashmap(arr);
    }
}
