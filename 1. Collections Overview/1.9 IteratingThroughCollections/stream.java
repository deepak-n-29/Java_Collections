import java.util.Arrays;
import java.util.List;

public class stream {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,7,20,40);

        list
        .stream()
        .forEach(x -> System.out.println(x));

        System.out.println();

        list
        .stream()
        .filter(x -> x%2==0)
        .forEach(x -> System.out.println(x));

        // each element goes through the filter and then goes to the forEach one by one with stream
    }

}