import java.util.*;

public class CollectionsBinarySearch {

   public static void main(String[] args) {

       // =====================================================
       // 1. Basic binary search
       // =====================================================

       List<Integer> list = new ArrayList<>();

       list.add(10);
       list.add(40);
       list.add(55);

       System.out.println("List: " + list);
       int index = Collections.binarySearch(list, 40); // Time complexity: O(log n)
       System.out.println("Index of 40: " + index);

       // =====================================================
       // 2. Element not present
       // =====================================================

       int result = Collections.binarySearch(list, 15); // Time complexity: O(n)

       System.out.println("\nSearch 15: " + result);
       // result = -(insertionPoint) - 1
       int insertionPoint = -result - 1;
       System.out.println("Insertion point: " + insertionPoint);

       // =====================================================
       // 3. Duplicate elements
       // =====================================================

       List<Integer> duplicates = Arrays.asList(10, 20, 20, 20, 30);

       int duplicateIndex = Collections.binarySearch(duplicates, 20); // Time complexity: O(n)

       System.out.println("\nDuplicate list: " + duplicates);
       System.out.println("Index returned for 20: " + duplicateIndex);

       // =====================================================
       // 4. LinkedList
       // =====================================================

       List<Integer> linkedList = new LinkedList<>();

       linkedList.add(10);
       linkedList.add(20);
       linkedList.add(30);
       linkedList.add(40);

       int linkedIndex = Collections.binarySearch(linkedList, 30); // Time complexity: O(n)

       System.out.println("\nLinkedList: " + linkedList);
       System.out.println("Index of 30: " + linkedIndex);
   }
}
