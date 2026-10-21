import java.util.HashSet;

public class printRepeatedElement {

    public static void printRepeatedElementNaive(int[] arr) {
        for(int i=1;i<arr.length;i++){
            boolean flag = false;
            for(int j=0; j<i;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == true){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void printRepeatedElementHash(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.print(arr[i] + " ");
            }
            else{
                set.add(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {1,2,2,3,4,4,5};
        printRepeatedElementNaive(arr);
        System.out.println();
        printRepeatedElementHash(arr);
        
    }
}
