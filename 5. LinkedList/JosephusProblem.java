import java.util.Iterator;
import java.util.LinkedList;

class JosephusProblem{

    static int josephusWithIterator(int n, int k){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();

        while(list.size()>1){
            int count = 0;
            while(count<k){

                if(!it.hasNext()){
                    it = list.iterator(); //reset iterator to begin
                }

                it.next();
                count++; 
            }
            it.remove();
        }
        return list.get(0);

    }

    static int josephusWithoutIterator(int n, int k) {

        LinkedList<Integer> list =new LinkedList<>();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        
        //LOGIC: The index of the person to be killed is (index + k - 1) % list.size()
        // GENERAL CIRCULAR LOGIC: index = index % size 
        // here for josephus we are moving k-1 places because current index is already taken into consideration
        // suppose there are k=3 people and im the 1st one, to reach the 3rd person we need to move 2 places, so i made 2 jumps and reached the 3rd person
        // 2 jumps = 3-1 i.e x = k-1 
        int index = 0;

        while (list.size() > 1) {
            index = (index + k - 1) % list.size();
            list.remove(index);
        }

        return list.get(0);
    }
    public static void main(String[] args){
        System.out.println("Josephus with iterator: "+josephusWithIterator(7,3));
        System.out.println("Josephus without iterator: "+josephusWithoutIterator(7,3));
    }
}

