// i/p: {5,15,10,8,6,12,7}
// o/p: {15,-1,12,12,12,-1,-1}

import java.util.ArrayDeque;
import java.util.Deque;

public class nextGreaterElement {
    
    public void nextGreaterElementNaive(int[] arr){
        for(int i=0;i<arr.length;i++){
            int ng=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    ng=arr[j];
                    break;
                }
            }
            System.out.print(ng + " ");
        }
    }

    public void nextGreaterElementUsingStack(int[] arr){
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        stack.push(arr[n-1]);

        int res[] = new int[n];
        res[n-1] = -1;

        for(int i=n-2;i>=0;i--){
            while(stack.isEmpty()==false && stack.peek()<=arr[i]){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }

    }

    public static void main(String[] args) {
        nextGreaterElement obj = new nextGreaterElement();
        int[] arr = {5,15,10,8,6,12,7};
        obj.nextGreaterElementNaive(arr);
        System.out.println();
        int[] arr2 = {5,15,10,8,6,12,7};
        obj.nextGreaterElementUsingStack(arr2);
    }
}
