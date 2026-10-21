import java.util.Map;
import java.util.TreeMap;

public class treemap {

    public static void main(String args[]){
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        //put
        map.put(10, "Geeks");
        map.put(20, "For");
        map.put(30, "Geeks");

        System.out.println(map);

        //containsKey
        System.out.println(map.containsKey(10));

        //Traversal
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //Navigation Methods
        System.out.println("Higher key : " + map.higherKey(20));
        System.out.println("Lower key : " + map.lowerKey(20));

        System.out.println("Floor key : " + map.floorKey(20));
        System.out.println("Ceiling key : " + map.ceilingKey(20));

        //First and last
        System.out.println("First key : " + map.firstKey());
        System.out.println("Last key : " + map.lastKey());

        //remove
        map.remove(10);
        System.out.println(map);

        //size
        System.out.println("Size : " + map.size());

        //clear
        map.clear();
        System.out.println(map);

    
    }
}
