import java.util.Arrays;
public class LongestCommonPrefixUsingMismatch {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};
        int[] b = {10, 20, 30, 60, 70};

        int mismatchIndex = Arrays.mismatch(a, b);

        // If arrays are identical then return the length of the array which is minimum
        if (mismatchIndex == -1) {
            mismatchIndex = Math.min(a.length, b.length);
        }

        System.out.println("Array A : " + Arrays.toString(a));
        System.out.println("Array B : " + Arrays.toString(b));

        System.out.println("\nLongest Common Prefix Length = " + mismatchIndex);
        System.out.print("Longest Common Prefix = ");

        for (int i = 0; i < mismatchIndex; i++) {
            System.out.print(a[i] + " ");
        }
    }
}