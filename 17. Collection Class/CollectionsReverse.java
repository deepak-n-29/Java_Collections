import java.util.*;

public class CollectionsReverse {

   public static void main(String[] args) {

       // =====================================================
       // 1. Reverse an ArrayList
       // =====================================================

       List<Integer> arrayList = new ArrayList<>();

       arrayList.add(10);
       arrayList.add(20);
       arrayList.add(30);

       System.out.println("ArrayList before: " + arrayList);
       Collections.reverse(arrayList);
       System.out.println("ArrayList after : " + arrayList);


       // =====================================================
       // 2. Reverse a LinkedList
       // =====================================================

       List<Integer> linkedList = new LinkedList<>();

       linkedList.add(100);
       linkedList.add(200);
       linkedList.add(300);

       System.out.println("\nLinkedList before: " + linkedList);
       Collections.reverse(linkedList);
       System.out.println("LinkedList after : " + linkedList);


       // =====================================================
       // 3. Reverse an Array using Arrays.asList()
       // =====================================================

       Integer[] arr = {10, 20, 30, 40};

       System.out.println("\nArray before: " + Arrays.toString(arr));
       // Arrays.asList(arr) creates a List backed by the
       // same array.
       Collections.reverse(Arrays.asList(arr));
       System.out.println("Array after : "+ Arrays.toString(arr));
   }
}
