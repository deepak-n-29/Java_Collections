// I/P: {15, 10, 18, 12, 4, 6, 2, 8}
// O/P: {-1, 15, -1, 18, 12, 12, 6, 12}

import java.util.ArrayDeque;
import java.util.Deque;

public class previousGreaterElement {
    void previousGreaterElementNaive(int[] arr){
        for(int i=0;i<arr.length;i++){
            int pg=-1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    pg=arr[j];
                    break;
                }
            }
            System.out.print(pg + " ");
        }
    }   

    void previousGreaterElementUsingStack(int[] arr){
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(arr[0]);
        int pg=-1;
        System.out.print(pg + " ");
        
        for(int i=1;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            pg = stack.isEmpty() ? -1 : stack.peek();
            System.out.print(pg + " ");
            stack.push(arr[i]);
        }

    }

    public static void main(String[] args) {
        previousGreaterElement obj = new previousGreaterElement();
        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        obj.previousGreaterElementNaive(arr);
        System.out.println();
        int[] arr2 = {15, 10, 18, 12, 4, 6, 2, 8};
        obj.previousGreaterElementUsingStack(arr2);
    }
}
