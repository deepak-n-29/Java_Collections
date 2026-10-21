import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ArrItem{
    int item;
    int index;
    ArrItem(int item, int index){
        this.item = item;
        this.index = index;
    }
}
public class KeepingIndexesAfterSorting { // TC: O(nlogn)
    
    void printIndexesSorted(int[] arr) {
        int n = arr.length;
        List<ArrItem> list = new ArrayList<ArrItem>();
        for(int i=0;i<n;i++){
            list.add(new ArrItem(arr[i], i));
        }

        Collections.sort(list, (a,b) -> a.item - b.item);
        for(ArrItem a: list){
            System.out.println(a.item + "->" + a.index);
        }
    }

    public static void main(String[] args) {
        int[] arr = {20,10,4,5};
        KeepingIndexesAfterSorting obj = new KeepingIndexesAfterSorting();
        obj.printIndexesSorted(arr);
    }
}
