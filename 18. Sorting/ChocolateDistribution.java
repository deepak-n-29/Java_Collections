import java.util.Arrays;

// The problem is:

// We have n chocolate packets.
// Each packet has some number of chocolates.
// There are m children.
// Every child must receive exactly one packet.
// We need to choose m packets such that the difference between the maximum and minimum chocolates is minimum.
public class ChocolateDistribution {
    int minDiff(int arr[], int m){
        if(m > arr.length)
            return -1;
        
        Arrays.sort(arr);
        int res = arr[m-1] - arr[0];
        for(int i=0; (i+m-1) < arr.length; i++){
            res = Math.min(res, arr[i+m-1] - arr[i]);
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;
        ChocolateDistribution obj = new ChocolateDistribution();
        System.out.println(obj.minDiff(arr, m));
    }
}
