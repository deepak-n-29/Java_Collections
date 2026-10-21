
// I/P: arr[] = {8,100,20,40,3,7}, k=10
// O/P: smaller = {8, 3, 7}

// I/P: arr[] = {100,20,40,60,80,200}, k=50
// O/P: smaller = {20, 40}

import java.util.ArrayList;
import java.util.List;

public class listOfSmallerElements {

    static List<Integer> getSmaller(int arr[], int k){ // Time Complexity: O(n), Space Complexity: O(n)
        List<Integer> al = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]<k){
                al.add(arr[i]);
            }
        }
        return al;
    }
    public static void main(String args[]){
        int arr[] = {10, 40, 80, 30, 20, 15};
        List<Integer> al = getSmaller(arr, 30);
        for(Integer x: al){
            System.out.print(x + " ");
        }
    }
}
