import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class reverseOrderOfItem{

    public void reverseItem(List<Integer> arr){
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=0;i<arr.size();i++){
            s.push(arr.get(i));
        }
        for(int i=0;i<arr.size();i++){
            arr.set(i,s.pop());
        }
    }
    public static void main(String[] args){
        reverseOrderOfItem obj = new reverseOrderOfItem();
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));
        obj.reverseItem(arr);
        System.out.println(arr);
    }
}