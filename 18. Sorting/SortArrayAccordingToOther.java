import java.util.Arrays;

class pair{
    int first;
    char second;

    pair(int first, char second){
        this.first = first;
        this.second = second;
    }
}

public class SortArrayAccordingToOther { // Time Complexity: O(nlogn)
    void printSorted(int[] a, char[] b){
        int n = a.length;
        pair[] arr = new pair[n];
        for(int i=0;i<n;i++){
            arr[i] = new pair(a[i], b[i]);
        }
        Arrays.sort(arr, (i,j)->i.first - j.first);
        for(int i=0;i<n;i++){
            b[i] = arr[i].second;
            System.out.print(b[i] + " ");
        }
    }    

    public static void main(String[] args){
        int[] a = {10, 15, 5};
        char[] b = {'x', 'y', 'z'};
        SortArrayAccordingToOther obj = new SortArrayAccordingToOther();
        obj.printSorted(a, b);
    }
}
