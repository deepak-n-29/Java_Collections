import java.util.ArrayList;

public class medianOfRowWiseSortedMatrix {

    //Naive method: using sorting
    static int medianUsingSorting(int mat[][], int r, int c){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                list.add(mat[i][j]);
            }
        }
        list.sort(null);
        return list.get(list.size()/2);
    }

    // TC: O(log(r*c))

    static int countLessOrEqual(int[] rows, int guess){
        int lo=0, hi=rows.length;
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            if(rows[mid] <= guess)
                lo = mid+1;
            else
                hi = mid;
        }
        return lo;
    }
    // TC: O(log(r*c))
    public static int matMed(int mat[][], int r, int c){
        int target = ((r*c)+1)/2; //1. median index in sorted matrix is (r*c)

        //2. initialize min and max elements of first row - first and last column
        int min = mat[0][0];
        int max = mat[0][c-1];

        //3. find min and max elements of the matrix
        for(int i=0;i<r;i++){
            if(mat[i][0] < min)
                min = mat[i][0];
            if(mat[i][c-1] > max)
                max = mat[i][c-1];
        }

        //4. Binary Search on the Value
        while(min < max){
            int guess = min + (max - min)/2; // guess is the median element
            int count =0;
            
            for(int i=0; i<r; i++){
                count += countLessOrEqual(mat[i], guess);
            }
            if(count < target)
                min = guess+1; // too few -> answer is above guess
            else
                max = guess;   // enough -> guess still in play
        }

        return min; // min is the median

    }
    public static void main(String[] args)
    {
        int r = 3, c = 5;
        int m[][]= { {5,10,20,30,40}, {1,2,3,4,6}, {11,13,15,17,19} };
        System.out.println("Median using sorting is " + medianUsingSorting(m, r, c)); // time complexity O(r*c * log(rc))
        System.out.println("Median is " + matMed(m, r, c));  // time complexity O(r*log(max-min)*log(c))
        
        int t[][] = { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15} };
        r=3; c=5;
        System.out.println("Median using sorting is " + medianUsingSorting(t, r, c));
        System.out.println("Median is " + matMed(t, r, c));

        int neg[][] = {{-5, -3, -1}, {-9,-8,0}, {-4, 2, 7}};
        r=3; c=3;
        System.out.println("Median using sorting is " + medianUsingSorting(neg, r, c));
        System.out.println("Median is " + matMed(neg, r, c));

        int d[][]= {{1,1,1}, {1,1,1}, {1,1,1}};
        r=3; c=3;
        System.out.println("Median using sorting is " + medianUsingSorting(d, r, c));
        System.out.println("Median is " + matMed(d, r, c));
    }
}
