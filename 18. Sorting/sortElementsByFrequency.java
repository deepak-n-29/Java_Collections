import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Given an integer array, sort the elements according to their frequency.
// Rules:
    // Element with higher frequency comes first.
    // If two elements have the same frequency, the smaller value comes first.
    // All occurrences of an element must stay together.
// Example
    // arr = {10, 5, 20, 10, 10, 10, 5, 20}
    // Frequencies:
    // 10 → 4
    // 5  → 2
    // 20 → 2
// So:
    // 10 has highest frequency → all 10s first.
    // 5 and 20 both occur twice.
    // 5 < 20, so 5 comes before 20.

// Output: 10 10 10 10 5 5 20 20

class myComparator implements Comparator<Map.Entry<Integer, Integer>> {
    public int compare(Map.Entry<Integer, Integer> m1, Map.Entry<Integer, Integer> m2) {
        if(m1.getValue() == m2.getValue()) 
            return m1.getKey() - m2.getKey();  // If frequencies are same, then smaller element comes first 
        return m2.getValue() - m1.getValue();  // If frequencies are different, then higher frequency comes first
    }
}
public class sortElementsByFrequency {  // Time Complexity: O(nlogn)
    static void sortByFrequency(int arr[]) {
        Map<Integer, Integer> map = new HashMap<>(); // Step 1: Create HashMap and store frequencies ex: {10:4, 5:2, 20:2}
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) +1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet()); // Step 2: Convert HashMap to List and sort based on frequency
        Collections.sort(list, new myComparator());

        int index = 0;
        for(Map.Entry<Integer, Integer> e: list){ // Step 3: Put elements in original array
            for(int i=0;i<e.getValue();i++){
                arr[index++] = e.getKey();
            }
        }

        for(int i=0;i<arr.length;i++){      // Step 4: Print the sorted array
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 4};
        sortByFrequency(arr);
    }

}
