import java.util.ArrayDeque;
import java.util.Deque;

public class stockSpan {
    void printSpan(int[] arr){
        for(int i=0;i<arr.length;i++){
            int span = 1;
            for(int j=i-1;j>=0 && arr[j]<=arr[i];j--){
                    span++;
            }
            System.out.print(span + " ");
        }
        System.out.println();
    }

    // Stack stores indexes of previous greater elements.
    // Remove smaller/equal elements as they can never contribute to future spans.
    void printSpanWithStack(int[] arr){
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(0);
        int span=1;
        System.out.println(span + " ");

        for(int i=1;i<arr.length;i++){
            while(stack.isEmpty()==false && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            // Span = distance from the current index to the previous greater element.
            // If no previous greater exists, span = current index + 1.
            span = (stack.isEmpty()) ? i+1 :i-stack.peek();
            System.out.print(span + " ");
            stack.push(i); 
        }
    }
    public static void main(String[] args) {
        stockSpan obj = new stockSpan();
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        System.out.println("printSpan: ");
        obj.printSpan(arr);
        System.out.println();

        int [] arr2 = {60,10,20,40,35,30,50,70,65};
        System.out.println("printSpanWithStack: ");
        obj.printSpanWithStack(arr2);
    }
}
