//1. add(price, item)
//2. find(price)
//3. printSorted()
//4. printGreaterSorted(price)
//5. printSmallerSorted(price)

// add(10, "abc"), add(5, "xyz"), add(100, "pqr")
// find(5): xyz
//printSorted(): 5->xyz, 10->abc, 100->pqr
//printGreaterSorted(7): 10->abc, 100->pqr
//printSmallerSorted(7): 5->xyz

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class DSforItemPrices {
    TreeMap<Integer, String> map;
    DSforItemPrices(){
        map = new TreeMap<Integer, String>();
    }
    //add
    void add(int price, String item){ //O(logn)
        map.put(price, item);
    }

    //find
    String find(int price){     //O(logn)
        String res = map.get(price);
        if(res == null){
            return "Item not found";
        }
        return res;
    }

    //printSorted
    void printSorted(){         //O(n)
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    //printGreaterSorted
    void printGreaterSorted(int price){         //O(logn)
        SortedMap<Integer, String> res = map.tailMap(price);
        for(Map.Entry<Integer, String> entry : res.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    //printSmallerSorted
    void printSmallerSorted(int price){         //O(logn)
        SortedMap<Integer, String> res = map.headMap(price);
        for(Map.Entry<Integer, String> entry : res.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        DSforItemPrices obj = new DSforItemPrices();
        obj.add(10, "abc");
        obj.add(5, "xyz");
        obj.add(100, "pqr");
        System.out.println(obj.find(5));
        System.out.println();

        System.out.println("printSorted: ");
        obj.printSorted();
        System.out.println();
        System.out.println("printGreaterSorted: ");
        obj.printGreaterSorted(7);
        System.out.println();
        System.out.println("printSmallerSorted: ");
        obj.printSmallerSorted(7);
    }


}
