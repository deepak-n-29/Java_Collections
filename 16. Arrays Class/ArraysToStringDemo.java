import java.util.Arrays;

// User-defined class
class Point {

    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Called by Arrays.toString()
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

public class ArraysToStringDemo {
    public static void main(String[] args) {
        // =====================================================
        // Example 1 : Primitive int array
        // =====================================================
        int[] arr = {10, 20, 30};

        System.out.println("===== Primitive int[] =====");

        System.out.println("Without Arrays.toString():");
        System.out.println(arr);

        System.out.println("\nWith Arrays.toString():");
        System.out.println(Arrays.toString(arr));

        // =====================================================
        // Example 2 : Character Array
        // =====================================================
        char[] chars = {'A', 'B', 'C'};

        System.out.println("\n===== char[] =====");

        System.out.println("println(char[]) :");
        System.out.println(chars);

        System.out.println("Arrays.toString(char[]) :");
        System.out.println(Arrays.toString(chars));

        // =====================================================
        // Example 3 : String Array
        // =====================================================
        String[] names = {"Java", "Python", "C++"};

        System.out.println("\n===== String[] =====");
        System.out.println(Arrays.toString(names));

        // =====================================================
        // Example 4 : User-defined Object Array
        // =====================================================
        Point[] points = {
                new Point(10, 20),
                new Point(5, 30),
                new Point(15, 40)
        };

        System.out.println("\n===== Object Array =====");
        System.out.println(Arrays.toString(points));
    }
}