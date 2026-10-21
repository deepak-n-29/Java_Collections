import java.util.Arrays;

public class FillDemo {
    public static void main(String[] args) {
        // =====================================================
        // 1. Fill Entire int Array
        // =====================================================
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original int array:");
        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, -1);

        System.out.println("After Arrays.fill(numbers, -1):");
        System.out.println(Arrays.toString(numbers));
        // =====================================================
        // 2. Fill Part of an Array
        // Range: [fromIndex, toIndex)
        // fromIndex -> Included
        // toIndex   -> Excluded
        // =====================================================
        int[] arr = {10, 20, 30, 40, 50};

        Arrays.fill(arr, 1, 4, 99);

        System.out.println("\nPartial Fill [1,4):");
        System.out.println(Arrays.toString(arr));
        // =====================================================
        // 3. Fill Character Array
        // =====================================================
        char[] stars = new char[8];

        Arrays.fill(stars, '*');

        System.out.println("\nCharacter Array:");
        System.out.println(Arrays.toString(stars));
        // =====================================================
        // 4. Fill Boolean Array
        // =====================================================
        boolean[] visited = new boolean[5];

        Arrays.fill(visited, true);

        System.out.println("\nBoolean Array:");
        System.out.println(Arrays.toString(visited));
        // =====================================================
        // 5. Fill Double Array
        // =====================================================
        double[] prices = new double[4];

        Arrays.fill(prices, 99.99);

        System.out.println("\nDouble Array:");
        System.out.println(Arrays.toString(prices));
        // =====================================================
        // 6. Fill String Array
        // =====================================================
        String[] names = new String[5];

        Arrays.fill(names, "Java");

        System.out.println("\nString Array:");
        System.out.println(Arrays.toString(names));
        // =====================================================
        // 7. Fill 2D Array
        // Arrays.fill() works only on 1D arrays.
        // So fill each row separately.
        // =====================================================
        int[][] matrix = new int[3][4];
        for (int[] row : matrix) {
            Arrays.fill(row, 1);
        }

        System.out.println("\n2D Array:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        // =====================================================
        // 8. Reset an Existing Array
        // =====================================================
        int[] dp = {5, 7, 8, 10, 15};

        System.out.println("\nBefore Reset:");
        System.out.println(Arrays.toString(dp));

        Arrays.fill(dp, 0);

        System.out.println("After Reset:");
        System.out.println(Arrays.toString(dp));
        // =====================================================
        // 9. Common DP Initialization
        // =====================================================
        int[] memo = new int[10];

        Arrays.fill(memo, -1);

        System.out.println("\nDP Memo Initialization:");
        System.out.println(Arrays.toString(memo));
        // =====================================================
        // 10. IMPORTANT:
        // Object arrays store the SAME reference.
        // =====================================================
        StringBuilder[] builders = new StringBuilder[3];
        Arrays.fill(builders, new StringBuilder("Java"));
        builders[0].append(" Programming");

        System.out.println("\nObject Array Reference Demo:");

        for (StringBuilder sb : builders) {
            System.out.println(sb);
        }

        System.out.println("\nNotice all elements changed because");
        System.out.println("Arrays.fill() stored the SAME object reference.");
    }
}