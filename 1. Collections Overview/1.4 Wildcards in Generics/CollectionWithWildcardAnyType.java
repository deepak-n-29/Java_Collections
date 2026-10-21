import java.util.ArrayList;

class Student{}
class EnggStudent extends Student{}
public class CollectionWithWildcardAnyType {
    public static void main(String[] args) {
        ArrayList<?> al1=new ArrayList<>();
        ArrayList<EnggStudent> al2=new ArrayList<>();
        al1=al2;
        System.out.println("Output: " + al1);
        System.out.println("Output: " + al2);
    }
}
