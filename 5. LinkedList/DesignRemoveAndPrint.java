import java.util.Iterator;
import java.util.LinkedList;

public class DesignRemoveAndPrint {

    LinkedList<Integer> list = new LinkedList<>();

    void add(int x) {
        list.add(x);
    }

    void removeAndPrint(int x) {

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            int curr = it.next();
            if (curr == x) {
                it.remove();      // Remove x
            }
            else {
                System.out.print(curr + " ");   // Print others
            }
        }
        System.out.println();   // Move to next line
    }

    public static void main(String[] args) {

        DesignRemoveAndPrint obj = new DesignRemoveAndPrint();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(3);

        obj.removeAndPrint(3);
        // Verify internal state
        obj.removeAndPrint(4);
        obj.removeAndPrint(10);
        
    }
}