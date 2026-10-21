import java.util.HashSet;

public class printDistinctElement {
    
    static void printDistinctElementNaive(int[] arr) { 
        // time complexity O(n^2) and space complexity O(1)
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j=0; j<i;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.print(arr[i] + " ");
            }
        }
    }

    static void printDistinctElementHash(int[] arr) { 
        // time complexity O(n) and space complexity O(n)
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])==false){
                set.add(arr[i]);
                System.out.print(arr[i] + " ");            
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5};
        printDistinctElementNaive(arr);
        System.out.println();
        printDistinctElementHash(arr);
    }
}
