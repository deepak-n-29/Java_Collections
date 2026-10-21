import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class example{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,20,30,8,7);

        list.stream()
            .filter(x->x%2==0)
            .filter(x-> x >10)
            .forEach(System.out::println);

    }
}