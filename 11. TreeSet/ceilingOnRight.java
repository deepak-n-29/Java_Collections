import java.util.TreeSet;

public class ceilingOnRight {

    public static void printCeilingOnRightNaive(int[] arr) { //O(n^2) time complexity and O(1) space
        int n = arr.length;
        for(int i=0;i<n;i++){
            int diff = Integer.MAX_VALUE;
            for(int j=i+1;j<n;j++){
                if(arr[j]>=arr[i]){
                    diff =Math.min(diff, arr[j]-arr[i]);
                }
            }
            if(diff==Integer.MAX_VALUE){
                System.out.println(-1);
            }
            else{
                System.out.println("ceiling for "+arr[i]+" is "+ (arr[i]+diff));
            }
        }
    }
    public static void printCeilingOnRight(int[] arr) {
        int n = arr.length;
        TreeSet<Integer> set = new TreeSet<>();
        int[] res = new int[n];

        //find smallest greater or equal element
        //for every array element
        for(int i=n-1; i>=0; i--){
            Integer ceiling  = set.ceiling(arr[i]);
            if(ceiling==null){
                res[i] = -1;
            }
            else{
                res[i] = ceiling;
            }
            set.add(arr[i]);
        }
        for(int i : res){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {10, 100, 200, 30, 120, 120};
        printCeilingOnRight(arr);
        System.out.println("************************");
        int [] arr1 = {100, 50, 30, 60, 55, 32};
        printCeilingOnRightNaive(arr1);


    }
}
