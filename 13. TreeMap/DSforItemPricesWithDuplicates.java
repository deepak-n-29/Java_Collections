//1. add(price, item)
//2. find(price)
//3. printSorted()
//4. printGreaterSorted(price)
//5. printSmallerSorted(price)

// add(10, "abc"), add(20, "bcd"), add(5, "cde")
// add(10, "efg"), add(20, "ghi")

//printSorted(): 5->cde, 10->abc, 10->efg, 20->bcd, 20->ghi
//find(10): abc, efg
//printGreaterSorted(7): 10->abc, 10->efg, 20->bcd, 20->ghi
//printSmallerSorted(7): 5->cde

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;

public class DSforItemPricesWithDuplicates {

    TreeMap<Integer, List<String>> map;
    DSforItemPricesWithDuplicates(){
        map = new TreeMap<>();
    }

    //add
    void add(int price, String item){         //O(logn)
        if(map.get(price)==null){
            map.put(price, new ArrayList<>());
        }
        map.get(price).add(item);
    }

    //find
    List<String> find(int price){         //O(logn)
        return map.get(price);
    }

    //printSorted
    void printSorted(){         //theta(n)
        for(Map.Entry<Integer, List<String>> entry : map.entrySet()){
            for(String item : entry.getValue()){
                System.out.println(entry.getKey() + " -> " + item);
            }
        }
    }

    //printGreaterSorted
    void printGreaterSorted(int price){         //O(logn)
        SortedMap<Integer, List<String>> res = map.tailMap(price);
        for(Map.Entry<Integer, List<String>> entry : res.entrySet()){
            for(String item : entry.getValue()){
                System.out.println(entry.getKey() + " -> " + item);
            }
        }
    }

    //printSmallerSorted
    void printSmallerSorted(int price){         //O(logn)
        SortedMap<Integer, List<String>> res = map.headMap(price);
        for(Map.Entry<Integer, List<String>> entry : res.entrySet()){
            for(String item : entry.getValue()){
                System.out.println(entry.getKey() + " -> " + item);
            }
        }
    }


    public static void main(String[] args) {
        
        DSforItemPricesWithDuplicates obj = new DSforItemPricesWithDuplicates();
        obj.add(10, "abc");
        obj.add(20, "bcd");
        obj.add(5, "cde");
        obj.add(10, "efg");
        obj.add(20, "ghi");

        System.out.println("printSorted: ");
        obj.printSorted();
        System.out.println();
        System.out.println("find(10): ");
        for(String item : obj.find(10)){
            System.out.println(item);
        }
        System.out.println();
        System.out.println("printGreaterSorted(7): ");
        obj.printGreaterSorted(7);
        System.out.println();
        System.out.println("printSmallerSorted(7): ");
        obj.printSmallerSorted(7);
    }    
}
